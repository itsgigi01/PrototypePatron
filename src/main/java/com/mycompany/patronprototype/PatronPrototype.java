/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronprototype;

/**
 *
 * @author itsme
 */
public class PatronPrototype {

    public static void main(String[] args) {
        //Original
        Guerrero GuerreroOriginal = new Guerrero ("Leon", "Espada"); 
        
        //clona 
        Guerrero GuerreroClonado= GuerreroOriginal.clonar();
        
        //Modificamos nombre y arma del guerrero clonado 
        GuerreroClonado.setArma("Lanza");
        GuerreroClonado.setName("Clon de Leon");
        
        //Mostramos los dos guerreros 
        
        System.out.println("Guerrero Original: "+GuerreroOriginal);
        System.out.println("Guerrero clon: " +GuerreroClonado);
    }
}
