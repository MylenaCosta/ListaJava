/*Nome: Mylena Costa
7º Semestre - Sistema de Informação
 */
package listas;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Lista2_Atividade4 {
    
    
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       
       /*Array de 03 Posições*/
       Integer[] valor = new Integer[3];
       
       /*Inserção de Dados*/
       System.out.println("Digite 3 valores");
       for (int i = 0; i < 3; i++); {
            valor[i] = in.nextInt();
        }
    
    /*Opção Crescente e Decrescente*/
        System.out.println("Digite 1 para Crescente e 2 para Decrescente");
        String opc = in.next();
    
        switch (opc) {
        case "1":
            System.out.println("Números em ordem Crescente:");
        /*Colocando os valores em ordem Crescente*/    
            Arrays.sort(valor);
            for (int i : valor)
                System.out.println(i);
            break;
        case"2":
            System.out.println("Números em ordem Decrescentes:");
            
        /*Colocando em ordem Decrescente com o Collections.ReverseOrder*/
            Arrays.sort(valor,Collections.reverseOrder());
            for (int i : valor)
                System.out.println(i);
            break;
            
            default:
                /*Caso nenhuma das opções foi a escolhida*/
                System.out.println("Digite 1 para crescente ou 2 para decrescente:");
            break;
            }    
}
}

        
            
            
        
     
       
    }
    
}
