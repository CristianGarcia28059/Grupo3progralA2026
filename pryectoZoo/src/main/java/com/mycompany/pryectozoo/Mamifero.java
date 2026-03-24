/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryectozoo;

/**
 *
 * @author crist
 */
public class Mamifero extends Animal {
    private String tipoPelaje; 
    private int mesesGestacion;

    public Mamifero(String nombre, String tipoDieta, double consumoDiarioKilos, String tipoPelaje, int mesesGestacion) {
        // 'super' llama al constructor de la clase padre (Animal)
        super(nombre, tipoDieta, consumoDiarioKilos);
        this.tipoPelaje = tipoPelaje;
        this.mesesGestacion = mesesGestacion;
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al mamifero " + nombre + " con dieta " + tipoDieta + ".");
        System.out.println("Se le ha proporcionado " + consumoDiarioKilos + " kg de alimento.");
        System.out.println("Nota: En sus primeros meses, este mamifero requirio lactancia materna.");
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("--- Ficha del Mamifero ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Pelaje: " + tipoPelaje);
        System.out.println("Gestacion: " + mesesGestacion + " meses");
    }
}
