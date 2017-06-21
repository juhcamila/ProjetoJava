/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MAQLABiii
 */
public class Aluno extends Pessoa{
  private String curso;

    public Aluno() {
        super();
        curso= new String();
    }

    public Aluno(String curso, int id, String nome) {
        super(id, nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
  public void cadastrar(List<Pessoa> alu){
      super.cadastrar(alu);
      do{
          curso=JOptionPane.showInputDialog(null, "Digite o curso");
      }while(curso.equals(""));
      
      if(this instanceof Aluno) alu.add(this);
      
      
  }
 
  
}
