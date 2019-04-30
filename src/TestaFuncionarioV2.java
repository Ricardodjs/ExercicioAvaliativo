/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class TestaFuncionarioV2 {
    public static void main(String[] args){
        FuncionarioV2 f2 = new FuncionarioV2();
        f2.Nome = "Paulo";
        f2.Departamento = "Cobrança";
        f2.DataDeEntrada = "20/04/2019";
        f2.RG = "11000000";
        f2.Salario = 3000;
    
        f2.mostra();
        
    }
}
