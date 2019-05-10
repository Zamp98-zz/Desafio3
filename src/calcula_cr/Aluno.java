/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula_cr;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arthur
 */


public class Aluno {
    private int matricula;
    private int CR;
    private int media;

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    private List mat = new ArrayList<Materia>();

    public List getMat() {
        return mat;
    }

    public void setMat(Materia m) {
        this.mat.add(m);
    }
    public Aluno(int matricula, int CR) {
        
        this.matricula = matricula;
        this.CR = CR;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCR() {
        return CR;
    }

    public void setCR(int CR) {
        this.CR = CR;
    }
    public void imprime(){
        
        System.out.print("Matricula :"+this.matricula+" CR: "+this.CR+" ");
        System.out.print("Materias cursadas:");
        for(int i = 0; i < mat.size(); i++){
            Materia m = (Materia)this.mat.get(i);
            m.imprime();
        }
    }
    
}
