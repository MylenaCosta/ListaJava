/*Nome: Mylena Costa 
7º Semestre - Sistema de Informação
  */
package listas;

import java.util.Scanner;

public class Lista1_Atividade3 {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        /*Inserção de Dados*/
        System.out.println("Insira o raio da lata de óleo: ");
        float raio = in.nextFloat();
        
        System.out.println("Insira a altura da lata de óleo: ");
        float altura = in.nextFloat();
        
        /*Formula de Cálculo do Volume*/
        /*Math.pow retorna a base elevada ao expoente power*/
        
        float volume = (float) (3.14 * Math.pow(raio, 2) * altura);
        
        /*Saída de Dados*/
        System.out.println("PI (3.14) multiplicaremos o Raio ao Quadrado ("+ raio +") que multiplicará pela Altura ("+altura+") e iremos obter o volume de : " + volume);
    }
}
    

