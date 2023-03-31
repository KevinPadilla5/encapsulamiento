/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionmetropulgada;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class ConversionMetroPulgada {
    static double pulgada = 39.37;
    static double pie = 3.28;
    
    static double conviertePies(double metros){
        return metros*pie;
    }
    
    static double conviertePulgadas (double metros){
        return metros*pulgada;
    }

   
    public static void main(String[] args) {
      double medida, conversion;
      int escala = 0, opcion = 0;
      Scanner valor = new Scanner (System.in);
      
      System.out.print("Ingrese la medida en metros");
      medida = valor.nextDouble();
      
      conversion = conviertePies(medida);
      System.out.println("Medida en pies: " +conversion);
      conversion = conviertePulgadas(medida);
      System.out.println("Medida en pulgadas" +conversion);
      
    }
    
}
