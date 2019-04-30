/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class TestaFuncionarioV4 {
public static void main(String[] args){
    FuncionarioV4 f4 = new FuncionarioV4();
    f4.Nome = "Jose";
    f4.RG = "12000000";
    
    FuncionarioV5 f5 = new FuncionarioV5();
    f5.Nome = "Manoel";
    f5.RG = "13000000";
    
    if(f4.equals(f5)){
        System.out.println("Iguais");
        
    }
    
    
}    
}
