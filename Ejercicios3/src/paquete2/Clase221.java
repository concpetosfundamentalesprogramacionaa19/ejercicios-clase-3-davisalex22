/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase221 {
    
    public static void main(String[] args) {
        
        // uso de expresionLogica ? expresion_1 : expresion_2
        
        int edad = 100;
     
        // ? SIGNIFICA UN SEPARADOR
        String resultado = edad>=18 ? "Usted es mayor de edad" :
                                      "Usted es menor de edad";
        
        System.out.printf("resultado es: %s\n", resultado);
        
    }
}
