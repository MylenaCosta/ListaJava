/*Nome: Mylena Costa
7º Semestre - Sistema de Informação
*/
package listas;

import java.util.Scanner;

public class Lista2_Atividade3 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       
        /*Inserção de Dados*/
        System.out.println("Digite a 1º nota:");
        float nota1 = in.nextFloat();
        
        System.out.println("Digite a 2º nota:");
        float nota2 = in.nextFloat();
        
        System.out.println("Digite a 3º nota:");
        float nota3 = in.nextFloat();
        
        /*Calculo da média*/
        
        double media = (nota1+nota2+nota3) /3;
       
        /*Maior nota das três*/
        /*Se nota1 for maior */
        
        if(nota1 > nota2 && nota1 > nota3){
            float maior = nota1;
            System.out.println("A maior nota é:" +maior+ "Média:" +media);
        }else
        /*Se nota2 for maior*/
        if (nota2 > nota1 && nota2 > nota3){
            float maior = nota2;
            System.out.println("A maior nota é:" +maior+ "Média:"+media);
            
        }else
            
        /*Se nota3 for maior*/
        if(nota3 >nota2 && nota3 >nota1);
            float maior = nota3;
        System.out.println("A maior nota é:" +maior + "Média:" +media);
                
        }
}

        
    

