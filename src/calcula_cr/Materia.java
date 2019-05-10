/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula_cr;

/**
 *
 * @author arthur
 */
public class Materia {
    private String codigo;
    private int carga_horaria;
    private int curso;
    private int nota;
    private int semestre;

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public Materia(String codigo, int carga_horaria, int curso, int nota, int semestre) {
        this.codigo = codigo;
        this.carga_horaria = carga_horaria;
        this.curso = curso;
        this.nota = nota; 
        this.semestre = semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    public void imprime(){
        System.out.print("Código: "+this.codigo+" Curso: "+this.curso+" Nota: "+this.nota+" Semestre: "+this.semestre);
    }
    
}
