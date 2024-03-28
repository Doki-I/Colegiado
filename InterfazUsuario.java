/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiado;

import javax.swing.JOptionPane;

class InterfazUsuario {
    private RegistroEstudiantes registro;

    public InterfazUsuario(RegistroEstudiantes registro) {
        this.registro = registro;
    }

    public void ejecutar() {
        while (true) {
            String opcionStr = JOptionPane.showInputDialog(null,
                    "Ingrese la opción que desea realizar:\n"
                            + "1. Agregar Estudiante\n"
                            + "2. Generar Reporte\n"
                            + "3. Salir");

            if (opcionStr == null || opcionStr.equals("3")) {
                JOptionPane.showMessageDialog(null, "¡Gracias por utilizar el sistema!");
                break;
            }

            try {
                int opcion = Integer.parseInt(opcionStr);
                if (opcion == 1) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                    String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del estudiante:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
                    String fechaIngreso = JOptionPane.showInputDialog("Ingrese la fecha de ingreso del estudiante:");
                    String cursoElegido = JOptionPane.showInputDialog("Ingrese el curso elegido por el estudiante:");
                    double costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del curso:"));

                    registro.agregarEstudiante(nombre, apellidos, edad, fechaIngreso, cursoElegido, costo);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese una opción válida.");
            }
        }
    }
}
