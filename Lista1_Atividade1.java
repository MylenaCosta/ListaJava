/*Nome: Mylena Costa
* 7ºSemestre - Sistema de Informação 
*/ 
package listas;

import java.util.Scanner;

public class Lista1_Atividade1 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        /*Inserção de Dados*/
        
        System.out.println("Digite um número:" );
        float num1 = in.nextFloat();
        
        System.out.println("Digete um segundo número:");
        float num2 = in.nextFloat();
        
        /*Resultados/Formulas*/
        
        System.out.println(" Seus resultados são: ");
        System.out.println(" => Soma: " + (num1 + num2));
        System.out.println(" => Diferença: " + (num1 - num2));
        System.out.println(" => Produto: " + (num1 * num2));
        System.out.println(" => Média: " + (num1 + num2 / 2 ));
    }
    
}
