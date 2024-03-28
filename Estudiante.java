/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiado;

import javax.swing.JOptionPane;

class Estudiante {
    private String nombre;
    private String apellidos;
    private int edad;
    private String fechaIngreso;
    private String cursoElegido;
    private double costo;

    public Estudiante(String nombre, String apellidos, int edad, String fechaIngreso, String cursoElegido, double costo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.cursoElegido = cursoElegido;
        this.costo = costo;
    }

    public String getCursoElegido() {
        return cursoElegido;
    }

    public double getCosto() {
        return costo;
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellidos + "\n" +
                "Edad: " + edad + "\n" +
                "Fecha de Ingreso: " + fechaIngreso + "\n" +
                "Curso Elegido: " + cursoElegido + "\n" +
                "Costo: $" + costo;
    }
}
