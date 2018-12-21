package models;

import java.util.*;

public class Contato {
  public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

public Integer id;
  public String nome;
  public String email;
  public String telefone;

  public Contato(Integer id, String nome,
      String email, String telefone){
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
  }

  public Contato(){
    this.id = -1;
  }

  private static Set<Contato> contatos;

  static {
    contatos  = new HashSet<>();
    contatos.add(new Contato(1, "Joao","joao@ifrn.br", "99999-9999"));
    contatos.add(new Contato(2, "Maria","maria@ifrn.br", "98888-8888"));
  }

  public static Set<Contato> all(){
    return contatos;
  }

  public static Contato findById(Integer id){
    for(Contato contato: contatos){
      if(id.equals(contato.id)){
        return contato;
      }
    }
    return null;
  }

  public static void add(Contato contato){
    contatos.add(contato);
  }

  public static void remove(Contato contato){
    contatos.remove(contato);
  }
}
