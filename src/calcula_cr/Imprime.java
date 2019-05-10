/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula_cr;

import java.util.List;

/**
 *
 * @author arthur
 */
public abstract class Imprime {
    public Imprime(List a){
        int i = 0;
        for(i = 0; i < a.size(); i++){
            Aluno x = (Aluno)a.get(i);
            x.imprime();
        }
        
    }
}
