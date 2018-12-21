package util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compras {
	static private Integer cont;

	static public Map<String, List<String>> compras;
	
	static public boolean login(String usuario, String senha) {
		return usuario.equals(senha);
	}

	static public String getId() {
		cont = cont + 1;
		return "" + cont;
	}

	static {
		compras = new HashMap<>();
		compras.put("1", Arrays.asList("Arroz", "Pão"));
		cont = 1;
	}
}
