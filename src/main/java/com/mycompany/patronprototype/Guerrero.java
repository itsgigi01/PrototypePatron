/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronprototype;

/**
 *
 * @author itsme
 */
public class Guerrero implements PrototypeCharacter {

    private String name;
    private String arma;

    public Guerrero(String name, String arma) {
        this.name = name;
        this.arma = arma;
    }

    @Override
    public Guerrero clonar() {
        return new Guerrero(name, arma);
    }

    @Override
    public String toString() {
        return "Guerrero: " + name + " Arma: " + arma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

}
