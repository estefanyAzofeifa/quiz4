/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author estef
 */
public class Menu {
    //se crea un pequeno menu, para mostrar la informacion mas ordenada

    private byte opc;

    public void mostrarMenu() {
        metodos m = new metodos();
        while (opc != 3) {
            opc = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "***MENÚ PRINCIPAL***\n\n"
                    + "1.Agregar Estudiantes\n"
                    + "2.Mostrar notaMenores\n"
                    + "3.Mostrar notaMayores\n"
                    + "4.Mostrar Promedio\n"
                    + "5.Salir\n"
                    + "Digite su opción:"));
            switch (opc) {
                case 1: {
                    m.AgregarEstudiante();
                    break;
                }
                case 2: {
                    m.mostarNotasMenores();
                    break;
                }
                case 3: {
                    m.mostarEstudiantes();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "¡Opción incorrecta!");
                }
            }
        }

    }
}
