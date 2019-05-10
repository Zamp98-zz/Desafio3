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
public class Curso {
    private int cod;
    private int media;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Curso(int cod, int media) {
        this.cod = cod;
        this.media = media;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    public void imprime(){
        System.out.print(" Codigo:"+this.cod+" Média:"+this.media);
    }
}
