package controllers;

import models.Conta;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.*;
import javax.inject.Inject;


import views.html.contas.*;

public class ContaController extends Controller{

		@Inject
		FormFactory formFactory;
		
		//Para mostrar todas as contas
		public Result index() {
			Set<Conta> contas = Conta.all();
			return ok(index.render(contas));
		}
		
		//Para cirar uma conta
		public Result create() {
			Form contasForm = formFactory.form(Conta.class);
			return ok(create.render(contasForm));
		}
		
		//para salvar uma conta
		public Result save() {
			//Conta conta = formFactory.form(Conta.class).bindFromRequest().get();
			Form<Conta> contaForm = formFactory.form(Conta.class).bindFromRequest();
			Conta conta = contaForm.get();
			Conta.add(conta);
			return redirect(routes.ContaController.index());
		}
		
		//para editar uma conta
		public Result edit(Integer id) {
			Conta conta = Conta.findById(id);
			if(conta == null) return notFound( s: "Conta não encontrada");
			Form<Conta> contaForm = formFactory.form(Contas.class).fill(conta);

			return ok(edit.render(contaForm));
		}
		//para atualizar conta
		
		public Result update() {
			Conta conta = formFactory.form(Conta.class).bindFromRequest().get;
			Conta contaAntiga = Conta.findById(conta.id);
			if(contaAntiga == null) return notFound(s: "Conta não encontrada");
			contaAntiga.titulo = conta.titulo;
			contaAntiga.vencimento = conta.vencimento;
			contaAntiga.valor = conta.valor;
			return redirect(routes.ContaController.index());
		}
		
		public Result destroy(Integer id) {
			return TODO;
		}
		
		public Result show(Integer id) {
			return TODO;
		}
}
