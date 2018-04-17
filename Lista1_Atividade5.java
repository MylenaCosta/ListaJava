/*Nome: Mylena Costa
7º Semestre - Sistema de Informação*/
package listas;

import java.util.Scanner;


public class Lista_Atividade5 {
   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        /*Inserção de Dados*/
        System.out.println("Digite qualquer numero inteiro: ");
        int num1 = in.nextInt();
        
        /*Saída e Calculos*/
        System.out.println("O resultado do número inteiro ao quadrado é: " + (num1*num1));
    }
}
