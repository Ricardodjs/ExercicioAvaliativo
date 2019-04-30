/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class FuncionariosV4 {
  double Salario;
 String Nome;
 String Departamento;
 String DataDeEntrada;
 String RG;
 boolean ativo = true;
 
 void bonifica(double aumento){
     Salario = Salario + (Salario * aumento);
 }
 void demite(){
     ativo = false; 
   
 }
void mostrar(){
    System.out.println(Nome + "\n" +
            Departamento + "\n" +
            Salario + "\n" + 
            RG + "\n" + ativo + "\n"
            + Departamento + "\n"+ DataDeEntrada);
}  
}
