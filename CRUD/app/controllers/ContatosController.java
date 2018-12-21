package controllers;

import play.mvc.*;
import views.html.contatos.*;
import models.Contato;
import java.util.Set;
import javax.inject.Inject;
import play.data.*;

public class ContatosController extends Controller {
  @Inject
  private FormFactory formFactory;

  // Mostrar todos
  public Result index() {
      Set<Contato> contatos = Contato.all();
      return ok(index.render(contatos));
  }

  // Mostrar um contato
  public Result show(Integer id) {
	  Contato contato = Contato.findById(id);
	  if(contato==null) {
		  return notFound("Contato não encontrado.");
	  }
      return ok(show.render(contato));
  }

  // Exibir um formulario em branco
  public Result create() {
      Form<Contato> form = formFactory.form(Contato.class);
      return ok(create.render(form));
  }

  // Salvar os dados do contato
  public Result save() {
	  Form<Contato> form = formFactory.form(Contato.class).bindFromRequest();
      Contato contato = form.get();
      if(form.hasErrors()){
    	  return ok(create.render(form));
      } 
      Contato.add(contato);
      return redirect(routes.ContatosController.index());
  }

  // Editar um contato
  public Result edit(Integer id) {
	  Contato contato = Contato.findById(id);
	  if (contato==null) {
		  return notFound("Contato não encontrado.");
	  }
	  Form<Contato> form =
		formFactory.form(Contato.class).fill(contato);
      return ok(edit.render(form));
  }

  // Atualizar os dados do contato
  public Result update() {
      Contato contato =
        formFactory.form(Contato.class).bindFromRequest().get();
	  Contato contatoAntigo = Contato.findById(contato.id);
	 
	  if (contatoAntigo==null) {
		  return notFound("Contato não encontrado.");
	  }
	  
	  contatoAntigo.nome = contato.nome;
	  contatoAntigo.email = contato.email;
	  contatoAntigo.telefone = contato.telefone;
      return redirect(routes.ContatosController.index());
  }

  // Excluir um contato
  public Result destroy(Integer id) {
	  Contato contato = Contato.findById(id);
	  if (contato==null) {
		  return notFound("Contato não encontrado.");
	  }
      Contato.remove(contato);
      return redirect(routes.ContatosController.index());
  }
}
