/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryectozoo;

/**
 *
 * @author crist
 */
public abstract class Animal {
    protected String nombre;
    protected String tipoDieta; // Carnívoro, Herbívoro, etc.
    protected double consumoDiarioKilos;

    public Animal(String nombre, String tipoDieta, double consumoDiarioKilos) {
        this.nombre = nombre;
        this.tipoDieta = tipoDieta;
        this.consumoDiarioKilos = consumoDiarioKilos;
    }

    public abstract void alimentar();
    
    public abstract void mostrarCaracteristicas();

    public String getNombre() { return nombre; }
    public double getConsumoDiarioKilos() { return consumoDiarioKilos; }
}
