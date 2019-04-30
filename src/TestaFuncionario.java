/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class TestaFuncionario {
public static void main(String[] args){
 FuncionarioV1 f1 = new FuncionarioV1();
 f1.Nome = "Antonio";
 f1.Departamento = "Vendas";
 f1.ativo = true;
 f1.RG = "10000000";
 f1.Salario = 4000;
 
 f1.bonifica(15);
 
 System.out.println(f1.Salario);
 
 f1.demite();
 
 System.out.println(f1.ativo);
 
 
 
}
}
