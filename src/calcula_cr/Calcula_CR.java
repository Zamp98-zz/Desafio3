/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula_cr;
import calcula_cr.LeiaCSV;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author arthur
 */
public class Calcula_CR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LeiaCSV a = new LeiaCSV();
        a.run();
        //Imprime(a.dados);
        //List f = removeDuplicates((ArrayList<Aluno>) a.dados);
        //System.out.print(" \n\n\n\n\n");
        //Imprime(f);
        calculaCR(a.dados);
        calculaMedia(a.cursos, a.dados);
        Imprime(a.dados, a.cursos);
    }
    // Function to remove duplicates from an ArrayList  
    private static void Imprime(List dados, List cursos) {
        int i;
        System.out.print("------- O CR dos alunos é: --------\n");
        for(i = 0; i < dados.size(); i++){
            Aluno x = (Aluno)dados.get(i);
            //x.imprime();
            System.out.print(x.getMatricula()+" - "+x.getCR()+"\n");
        }
        System.out.print("\n-----------------------------------\n");
        System.out.print("----- Média de CR dos cursos ------\n");
        for(i = 0; i < cursos.size(); i++){
            Curso c = (Curso)cursos.get(i);
            System.out.print(c.getCod()+" - "+c.getMedia()+"\n");
        }
    }
    public static void calculaMedia(List cursos, List alunos){
        int i, tamCursos;
        tamCursos = cursos.size();
        
        for(i = 0; i < tamCursos; i++){
            int div = 0;
            int num = 0;
            int j, tamAlunos;
            tamAlunos = alunos.size();
            Curso c = (Curso)cursos.get(i);
            
            for(j = 0; j< tamAlunos; j++){
                
                Aluno temp = (Aluno)alunos.get(j);
                int k, tamMaterias;
                List materias = temp.getMat();
                tamMaterias = materias.size();
                
                for(k = 0; k < tamMaterias; k++){
                    Materia m = (Materia)materias.get(k);
                    
                    if(c.getCod() == m.getCurso()){
                        div++;
                        num += m.getNota();
                    }
                }
                
            }
            int media = num/div;
            c.setMedia(media);
        }
    }
    public static void calculaCR(List dados){
        int i, tam;
        tam = dados.size();
        for(i = 0; i < tam; i++){
            Aluno temp = (Aluno)dados.get(i);
            int j, mats;
            mats = temp.getMat().size();
            int numerador, denominador;
            numerador = denominador = 0;
            for(j = 0; j < mats; j++){
                Materia m = (Materia)temp.getMat().get(j);
                numerador += m.getCarga_horaria() * m.getNota();
                denominador += m.getCarga_horaria();
            }
            int cr = numerador/denominador;
            temp.setCR(cr);
            dados.set(i, temp);
        }
        //Imprime(dados);
    }
}
