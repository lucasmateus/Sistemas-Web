package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import play.mvc.*;

import util.Compras;

public class HomeController extends Controller {

	public Result login() {
		return ok(views.html.login.render());
	}
	
	public Result autenticar() {
		Map<String, String[]> r =
			    request().body().asFormUrlEncoded();
			String login = r.get("login")[0];
			String senha = r.get("senha")[0];
			if (Compras.login(login, senha)) {
				session("user", login);
				if(Compras.compras.get(login)==null) {
			   	  List<String> lista = new ArrayList<>();
				  Compras.compras.put(login, lista);
				}
				return redirect(routes.HomeController.index());
			} else {
				return unauthorized("Usuario não autorizado");
			}
			
	}
	
	public Result index() {
		String usuario = session("user");
		if (usuario == null || Compras.compras.get(usuario)==null) {
			return redirect(routes.HomeController.login());
		}
		List<String> lista = Compras.compras.get(usuario);
		return ok(views.html.index.render(lista, usuario));
	}

	public Result save() {
		String item = request().getQueryString("item");
		String usuario = session("user");
		if (usuario == null) {
			return redirect(routes.HomeController.login());
		}
		List<String> lista = Compras.compras.get(usuario);
		lista.add(item);
		return redirect(routes.HomeController.index());
	}

	public Result remove(String s) {
		String usuario = session("user");
		if (usuario == null) {
			return redirect(routes.HomeController.login());
		}
		List<String> lista = Compras.compras.get(usuario);
		lista.remove(s);
		return redirect(routes.HomeController.index());
	}

	public Result clean() {
		session().clear();
		return redirect(routes.HomeController.index());
	}
}
