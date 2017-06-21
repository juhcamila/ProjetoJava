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
public abstract class Pessoa {
  protected int id;
 protected String nome;
 public String getNome(){ return nome;}
  public Pessoa(){
      id=0;
      nome= new String();
  }
  
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected void cadastrar(List<Pessoa> alu){
        int aux=0;
      do{
        id=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id"));
        for(Pessoa a:alu){
            if(id==a.getId())
                aux=1;
        }
      }while(id<0||aux==1);
      
      do{
          nome=JOptionPane.showInputDialog(null,"Digite o nome");
      }while(nome.length()<=2);
      
  }
}
