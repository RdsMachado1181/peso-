/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.Scanner;

 

 

/**
 *
 * @author rdsmachado
 */
public class TESTE {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
   
         Scanner genero = new Scanner(System.in);
         
      PEso_Altura peso_altura = new PEso_Altura(20, 30);
  
         System.out.println(" Se for Homem digite 1 , se efor mulher digite 2 ");
         
        int numero =  genero.nextInt(); 
               
        switch( numero ){
            
            case 1: 
              //cahamada da função peso da classe PEso_Altura
                peso_altura.peso();
                
                 //cahamada da função altura da classe PEso_Altura
                peso_altura.altura();
                
                System.out.println( " O indice relacionado a sua altura e peso e: "+ peso_altura.homem());
                
                break;
            case 2:
                 //cahamada da função peso da classe PEso_Altura
                peso_altura.peso();
                
                 //cahamada da função altura da classe PEso_Altura
                peso_altura.altura();
                
                System.out.println( " O indice relacionado a sua altura e peso e: " + peso_altura.mulher());
                 
                break;
            default:{
              
                 System.out.println(" Digitado numero errado");
            }
        }
        
    }

    
   
    
    
}
 
 
    
         
 
       
      
     
 
