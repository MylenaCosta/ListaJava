/*Mylena Costa 
7º Semestre - Sistema de Informação e License Headers in Project Properties.
 */
package listas;

import java.util.Scanner;

public class Lista2_Atividade2 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        /* Inserção de Dados*/
        
        System.out.println("Insira o valor do primeiro lado do triângulo: ");
        float L1 = in.nextFloat();
        
         System.out.println("Insira o valor do segundo lado do triângulo: ");
        float L2 = in.nextFloat() ;
        
         System.out.println("Insira o valor do erceiro lado do triângulo: ");
        float L3 = in.nextFloat();
        
        /* Conferir se é um triângulo*/
        
        if (L1+L2 >L3 || L2+L3 > L1 || L3+L1 > L2);
            
        /*Condição para triângulo Isóceles*/
        if(L1==L2 && L2!=L3 ||  L3==L2 && L2!=L1 || L1==L3 && L3!=L2){
           System.out.println("Este triângulo é Isóceles");
           
        }else
        
        /*Condição se é um triângulo Escaleno*/
        if(L1!=L2 && L2!=L3 && L3!=L1){
            System.out.println("Este triângulo é um triângulo escaleno");
            
        }else
            
        /*Condição para triângulo Equilatero*/
        if (L1==L2 && L2 == L3){
            System.out.println("Este triângulo é um equilatero.");
        
        }else{
        
        /*Senão atender nenhum dos requisitos*/
        System.out.println("Isto não é um triângulo");
                            
            }
        }
    }

        
    

