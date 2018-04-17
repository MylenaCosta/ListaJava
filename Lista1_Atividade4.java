/*Nome: Mylena Costa 
7º Semestre - Sistema de Informação*/
package listas;

import java.util.Scanner;

public class Lista1_Atividade4 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        /*Inserção de Dados*/
        System.out.println("Digite o valor de A: ");
        int a = in.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int b = in.nextInt();
        
        /*Troca dos Valores das Variáveis*/
        int c = a;
            a = b;
            b = c;
        
        /*Saída de Dados*/
        System.out.println("Valor de A - B: " + a );
        System.out.println("Valor de B - A: " + b );
    }
    
}
