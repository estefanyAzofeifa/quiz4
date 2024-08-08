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
//se crean los metodos y se llaman en el menu
public class metodos {

    public Void AgregarEstudiante() {
        for (int i = 0; i < 3; i++) {
            notas nota = new notas();
            nota.setEstudiante(JOptionPane.showInputDialog(null, "Digite el nombre del estudiante:"));

            nota.setCurso(JOptionPane.showInputDialog(null, "Digite el nombre del curso del estudiante:"));
            nota.setProfesor(JOptionPane.showInputDialog(null, "Digite el nombre del profesor:"));
            nota.setNotas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la nota del estudiante:")));
        }
    }

    public void mostarEstudiantes() {
        notas nota = new notas();

        JOptionPane.showMessageDialog(null, "lista de estudiantes " + nota.getEstudiante());
    }

    public void mostarNotasMenores() {
        notas nota = new notas();
        double notasMenores = 0;
        for (int i = 0; i < 3; i++) {
            if (nota.getNotas() == < 70{
                notasMenores= ++1
            }
        }

            
        
    

 
         }
       
         }
       
