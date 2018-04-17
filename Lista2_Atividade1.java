/*Nome: Mylena Costa
 7º Semestre - Sistema de Informação*/
package listas;
import java.util.Scanner;
public class Lista2_Atividade1 {
    
    public static void main (String[] arg){
        Scanner in = new Scanner (System.in);
        
        /*Inserção de Dados*/
        System.out.println("Insira um numero");
        int num1 = in.nextInt ();
        
        /*Saída de Dados com as condições Neutro */
        
        if (num1 ==0) {
            System.out.println("Este número é neutro");
        } else { 
        
            /*Saída de Dados com Condições para pares*/
            if (num1 % 2 ==0){
                System.out.println("Este númeor é par!");
                
                /*Saída de dados se Par (positivo ou negativo)*/
                if (num1 > 0){
                    System.out.println("Este número é positivo!");
                } else {
                    System.out.println("Este número é Negativo");
                }
                } else {
                        /*Saída de dados Condição para ímpares*/
                        System.out.println("Este numero é ímpar");
                        if (num1 > 0){
                            
                        /*Saída de Dados caso Positivo ou Negativo*/
                            System.out.println(" Este número é Positivo");
                        } else { 
                            System.out.println("Este número é Negativo");
                               }
            }
        }
        
    }
    
}
                  
   

  

    