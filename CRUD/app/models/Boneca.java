package models;

import java.util.*;

public class Boneca {
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

  public Integer id;
  public String nome;
  public double altura;
  public String marca;

	
	static public boolean login(String usuario, String senha) {
		return usuario.equals(senha);
	}

  	public Boneca(Integer id, String nome,
      		double altura, String marca){
    		this.id = id;
    		this.nome = nome;
    		this.altura = altura;
    		this.marca = marca;
  	}

  public Boneca(){
    this.id = -1;
  }

  private static Set<Boneca> bonecas;

  static {
    bonecas  = new HashSet<>();
    bonecas.add(new Boneca(1, "Barbie",1.20, "Mattel"));
    bonecas.add(new Boneca(2, "Moranguinho",0.60, "Mimo"));
  }

  public static Set<Boneca> all(){
    return bonecas;
  }

  public static Boneca findById(Integer id){
    for(Boneca boneca: bonecas){
      if(id.equals(boneca.id)){
        return boneca;
      }
    }
    return null;
  }

  public static void add(Boneca boneca){
    bonecas.add(boneca);
  }

  public static void remove(Boneca boneca){
    bonecas.remove(boneca);
  }
}
