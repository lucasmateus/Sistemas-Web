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
			Conta conta = formFactory.form(Conta.class).bindFromRequest().get();
			Conta.add(conta);
			return redirect(routes.ContaController.index());
		}
		
		//para editar uma conta
		public Result edit(Integer id) {
			return TODO;
		}
		//para atualizar conta
		
		public Result update() {
			return TODO;
		}
		
		public Result destroy(Integer id) {
			return TODO;
		}
		
		public Result show(Integer id) {
			return TODO;
		}
}
