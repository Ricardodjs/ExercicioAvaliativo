/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class TestaFuncionarioV3 {
public static void main(String[] args){
   


Data d = new Data();
d.dia = 26;
d.mes = 10;
d.ano = 2016;

FuncionarioV3 f3 = new FuncionarioV3;

f3.Nome = "Pedro";
f3.Salario = 2500;
f3.ativo = true;
f3.RG = "17000000";

f3.DataDeEntrada = d

f3.bonifica(10);
f3.demite();
f3.mostra();  
}
}