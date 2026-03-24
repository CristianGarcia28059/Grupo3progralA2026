/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pryectozoo;

/**
 *
 * @author crist
 */
public class MainZoo {
    public static void main(String[] args) {
        Animal leon = new Mamifero("Leon Africano", "Carnivoro", 7.5, "Corto con melena", 4);
        
        leon.mostrarCaracteristicas();
        System.out.println(); // 
        leon.alimentar();
    }
}