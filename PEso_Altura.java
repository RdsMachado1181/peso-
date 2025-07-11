/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author rdsmachado
 */
public class PEso_Altura {
    
    Scanner dados =  new Scanner(System.in);
     
    private  double peso =0;
    private  double altura  =0;

    public PEso_Altura( double peso, double altura) {
        this.peso =peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    public double peso(){       
           
          
         System.err.println(" Digite o seu peso, por favor");
              
        
              return peso = dados.nextDouble();
    }
    
     public double  altura(){
         
         
         System.err.println(" Digite o sua altura, por favor");
             
      return altura = dados.nextDouble();         
    }
    
    public double homem(  ){
      
        return ((72.7 * altura ) -58);
    } 
      
    
    public double mulher( ){
      
        return ((62.1 * altura)- 44.7);
    } 
}
