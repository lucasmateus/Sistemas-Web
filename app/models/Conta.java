package models;

import java.util.*;

public class Conta {

  public Integer id;
  public String titulo;
  public String vencimento;
  public float valor;
  //public boolean tipo;
  //public boolean pago;

  public Conta(){
	  
  }

  public Conta(Integer id, String titulo, String vencimento, float valor) {
    this.id = id;
    this.titulo = titulo;
    this.vencimento = vencimento;
    this.valor = valor;
    //this.tipo = true;
    //this.pago = true;
  }

  

  private static Set<Conta> contas;

  static {
    contas  = new HashSet<>();
    contas.add(new Conta(1, "ABC", "26/09/2032",300));
    contas.add(new Conta(2,"ABCFC", "26/09/2032",600));
  }

  public static Set<Conta> all(){
    return contas;
  }

  public Conta findById(Integer id){
    for(Conta conta : contas){
      if(id.equals(conta.id)){
        return conta;
      }
    }
    return null;
  }

  public static void add(Conta conta){
    contas.add(conta);
  }

  public static void remove(Conta conta){
    contas.remove(conta);
  }
}