/* Nome: Mylena Costa 
/* 7º Semestre - Sistema de Informação 
*/
package listas;

import java.util.Scanner;

public class Lista1_Atividade2 {
   
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        /*Inserção de Dados*/
        
        System.out.println("Digite a temperatura em graus Centígrados: ");
        float temp = in.nextFloat();
        
        /*Formulas*/
        
        float F = (9 * temp + 160) / 5;
        
        /*Saída de Dados*/
        System.out.println("A temperatura de " + temp +" em Fahrenheit é :" + F);
        
    }
}
