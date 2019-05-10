/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula_cr;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arthur
 */
public class LeiaCSV implements runnable{
    public List dados =  new ArrayList<>();
    public List cursos = new ArrayList<>();
    public static void main(String[] args) {

    LeiaCSV obj = new LeiaCSV();
    obj.run();

  }
    public LeiaCSV() {
        
    }
  public void print(LeiaCSV obj){
      
  }
  public void run() {

    String arquivoCSV = "/home/arthur/NetBeansProjects/Calcula_CR/src/calcula_cr/entrada.csv";
    BufferedReader br = null;
    String linha;
    try {
        br = new BufferedReader(new FileReader(arquivoCSV));
        int i = 0;
        int flag = -1;
        while ((linha = br.readLine()) != null) {
            
            String[] dadoLinha = linha.split(",");
            //System.out.println(" Per: "+ "Mat: "+dadoLinha[0]+" Cod: "+dadoLinha[1]+" Cod_cur: "+dadoLinha[2]+" Nota: "+dadoLinha[3]+" CH: "+ dadoLinha[4]+" semestre "+dadoLinha[5]);
            String MATR = dadoLinha[0];
            
            Aluno a = new Aluno(0, 0);
            String CH, CUR, NOTA, SEMESTRE;
            CH = dadoLinha[4];
            CUR = dadoLinha[2];
            NOTA = dadoLinha[3];
            SEMESTRE = dadoLinha[5];
            int ch, cur, nota, semestre;
            Materia m;
            
            try{
                    int matr = Integer.parseInt(MATR);
                    a.setMatricula(matr);
                    ch = Integer.parseInt(CH);
                    cur = Integer.parseInt(CUR);
                    cursos(cursos, cur);
                    nota = Integer.parseInt(NOTA);
                    semestre = Integer.parseInt(SEMESTRE);
                    m = new Materia(dadoLinha[1], ch, cur, nota, semestre);
                    a.setMat(m);
                    if(!dados.isEmpty()){
                        int pos = seek(dados, matr);
                        if(pos >= 0){
                            Aluno temp = (Aluno)dados.get(pos);
                            temp.setMat(m);
                            dados.set(pos, temp);
                        }
                        else{
                            dados.add(a);
                        }
                    }
                    else dados.add(a);
                    
                    //System.out.print(i+" ");
            }catch (NumberFormatException nfe){
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }
        }
        
    } catch (FileNotFoundException e) {
    } catch (IOException e) {
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
            }
        }
    }
    
  }
  public void cursos(List cursos, int ch){
      int i, tam;
      tam = cursos.size();
      Curso c = new Curso(ch, 0);
      if(tam == 0)cursos.add(c);
      else
      for(i = 0; i < tam; i++){
          if((seekCurso(cursos, ch))< 0){
              
              cursos.add(c);
          }
      }
  }
  public int seekCurso(List dados, int ch){
      int pos = -1;
      int tam = dados.size();
      int i;
      for(i = 0; i < tam; i++){
          Curso temp = (Curso)dados.get(i);
          if(temp.getCod() == ch)return i;
      }
      return pos;
  }
  public int seek(List dados, int ch){
      int pos = -1;
      int tam = dados.size();
      int i;
      for(i = 0; i < tam; i++){
          Aluno temp = (Aluno)dados.get(i);
          if(temp.getMatricula() == ch)return i;
      }
      return pos;
  }
}
