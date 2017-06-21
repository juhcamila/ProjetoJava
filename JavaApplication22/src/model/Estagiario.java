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
public final class Estagiario extends Aluno{
    private float bolsa;

    public Estagiario() {
        super();
        bolsa=0;
    }

    public Estagiario(float bolsa, String curso, int id, String nome) {
        super(curso, id, nome);
        this.bolsa = bolsa;
    }
    

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void cadastrar(List<Pessoa> alu){
        super.cadastrar(alu);
        do{
        bolsa= Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a bolsa"));
        }while(bolsa==0);
    }
}
