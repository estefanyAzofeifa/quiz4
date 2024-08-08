/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author estef
 */
public class notas {
    //se crean los atributos, sett and gett

    public String Estudiante;
    public String Curso;
    public String profesor;
    public int Notas;

    public notas(String Estudiante, String Curso, String profesor, int Notas) {
        this.Estudiante = Estudiante;
        this.Curso = Curso;
        this.profesor = profesor;
        this.Notas = Notas;
    }

    public notas() {
    }

    public String getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(String Estudiante) {
        this.Estudiante = Estudiante;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getNotas() {
        return Notas;
    }

    public void setNotas(int Notas) {
        this.Notas = Notas;
    }

}
