/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class TestaPessoa {
  public static void mains(String[] args){
      Pessoa p = new Pessoa();
      p.nome = "Paulo";
      p.idade = 20;
      
      p.fazAniversario(1);
      p.fazAniversario(1);
  }  
}
