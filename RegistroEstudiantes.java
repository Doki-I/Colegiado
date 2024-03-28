/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiado;

import javax.swing.JOptionPane;

class RegistroEstudiantes {
    private static final int CAPACIDAD_MAXIMA = 100;
    private Estudiante[] estudiantes;
    private int contadorEstudiantes;

    public RegistroEstudiantes() {
        estudiantes = new Estudiante[CAPACIDAD_MAXIMA];
        contadorEstudiantes = 0;
    }

    public void agregarEstudiante(String nombre, String apellidos, int edad, String fechaIngreso, String cursoElegido, double costo) {
        if (contadorEstudiantes < CAPACIDAD_MAXIMA) {
            estudiantes[contadorEstudiantes++] = new Estudiante(nombre, apellidos, edad, fechaIngreso, cursoElegido, costo);
            JOptionPane.showMessageDialog(null, "Estudiante registrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay capacidad para más estudiantes.");
        }
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public int getContadorEstudiantes() {
        return contadorEstudiantes;
    }
}
