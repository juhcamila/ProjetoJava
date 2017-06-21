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
public class Funcionario extends Pessoa {
 private String cargo;
  
    public Funcionario() {
        super();
        cargo=new String();
    }

    public Funcionario(String cargo, int id, String nome) {
        super(id, nome);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
 public void cadastrar(List<Pessoa> alu){
     super.cadastrar(alu);
     do{
    cargo= JOptionPane.showInputDialog(null, "Digite o cargo:");
       }while(cargo.equals(""));
 
 }
 
}
