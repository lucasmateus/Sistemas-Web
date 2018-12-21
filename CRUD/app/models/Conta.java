package models;

import java.util.*;

public class Conta {

  public Integer id;
  public String titulo;
  public String vencimento;
  public float valor;
  public boolean tipo;
  public boolean pago;

  public Conta(Integer id, String titulo, String vencimento, float valor, boolean tipo, boolean pago) {
    this.id = id;
    this.titulo = titulo;
    this.vencimento = vencimento;
    this.valor = valor;
    this.tipo = tipo;
    this.pago = pago;
  }

  public Conta(){
    this.id = -1;
  }

  private static Set<Conta> contas;

  static {
    contas  = new HashSet<>();
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
    conta.add(conta);
  }

  public static void remove(Conta conta){
    conta.remove(conta);
  }
}
