package controllers;

import play.mvc.*;
import views.html.contatos.*;
import models.Boneca;
import java.util.Set;
import javax.inject.Inject;
import play.data.*;

public class BonecaController extends Controller {
  @Inject
  private FormFactory formFactory;

  // Mostrar todos
  public Result index() {
      Set<Boneca> bonecas = Boneca.all();
      return ok(index.render(bonecas));
  }

  // Mostrar um contato
  public Result show(Integer id) {
	  Boneca boneca = Boneca.findById(id);
	  if(boneca==null) {
		  return notFound("Boneca não encontrada.");
	  }
      return ok(show.render(boneca));
  }

  // Exibir um formulario em branco
  public Result create() {
      Form<Boneca> form = formFactory.form(Boneca.class);
      return ok(create.render(form));
  }

  // Salvar os dados do contato
  public Result save() {
      Form<Boneca> form = formFactory.form(Boneca.class).bindFromRequest();
      Boneca boneca = form.get();
      if(form.hasErrors()){
    	  return ok(create.render(form));
      } 
      Boneca.add(boneca);
      return redirect(routes.BonecaController.index());
  }

  // Editar um contato
  public Result edit(Integer id) {
	  Boneca boneca = Boneca.findById(id);
	  if (boneca==null) {
		  return notFound("Boneca não encontrada.");
	  }
	  Form<Boneca> form =
		formFactory.form(Boneca.class).fill(boneca);
      return ok(edit.render(form));
  }

  // Atualizar os dados do contato
  public Result update() {
      Boneca boneca =
        formFactory.form(Boneca.class).bindFromRequest().get();
	  Boneca bonecaAntiga = Boneca.findById(boneca.id);
	 
	  if (bonecaAntiga==null) {
		  return notFound("Boneca não encontrada.");
	  }
	  
	  bonecaAntiga.nome = boneca.nome;
	  bonecaAntiga.altura = boneca.altura;
	  bonecaAntiga.marca = boneca.marca;
      return redirect(routes.BonecaController.index());
  }

  // Excluir um contato
  public Result destroy(Integer id) {
	  Boneca boneca = Boneca.findById(id);
	  if (boneca==null) {
		  return notFound("Boneca não encontrada.");
	  }
      Boneca.remove(boneca);
      return redirect(routes.BonecaController.index());
  }
}
