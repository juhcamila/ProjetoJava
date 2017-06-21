
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Estagiario;
import model.Funcionario;
import model.Pessoa;



public class Main {
 public static void main(String args[]){
     List<Pessoa> alu= new ArrayList<>();
     List<Pessoa> fun= new ArrayList<>();
     List<Pessoa> est= new ArrayList<>();
     int opc;
     
     
      
      
     
     String alut="";
     String funt="";
     String estat="";
     String pesq="";
     
     do{
         opc=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção\n\nCadastrar\n\n1-Cadastrar Aluno\n"
                 + "2-Cadastrar Funcionario\n3-Cadastrar Estagiario\n\nListar\n\n21-Mostrar Aluno\n22-Mostrar Funcionario\n23-Mostrar Estagiario\n\n"
                 + "Pesquisar\n\n31-Listar Aluno\n32-Listar Funcionário\n33-Listar Estagiário\n\n 99-Sair "   ));
         
         switch(opc){
             case 1: Aluno obj= new Aluno(); 
                 obj.cadastrar(alu);
                     alu.add(obj);
                     alut+="\n\nId:"+obj.getId()+"\nNome:"+obj.getNome()+"\nCurso:"+obj.getCurso();
                     JOptionPane.showMessageDialog(null, "Mostrar Cadastro\n\nID:"+obj.getId()+"\nNome:"+obj.getNome()+"\nCurso:"+obj.getCurso());
                     break;
                     
                     case 2:  Funcionario obj1= new Funcionario();
                 obj1.cadastrar(fun);
                     fun.add(obj1);
                     funt+="\n\nId:"+obj1.getId()+"\nNome:"+obj1.getNome()+"\nCargo:"+obj1.getCargo();
                     JOptionPane.showMessageDialog(null, "Mostrar Cadastro\n\nID:"+obj1.getId()+"\nNome:"+obj1.getNome()+"\nCargo:"+obj1.getCargo());
                     break;
                     
                     case 3:  Estagiario obj2= new Estagiario();
                     obj2.cadastrar(est);
                     est.add(obj2);
                     estat+="\nNome:"+obj2.getNome()+"\nCurso:"+obj2.getCurso()+"\nBolsa:"+obj2.getBolsa();
                     JOptionPane.showMessageDialog(null, "Mostrar Cadastro\n\nNome:"+obj2.getNome()+"\nCurso:"+obj2.getCurso()+"\nBolsa:"+obj2.getBolsa());
                     break;
                     
                     case 21:if((alut.length()>1)) JOptionPane.showMessageDialog(null, "Mostrar Cadastros"+alut);
                     else JOptionPane.showMessageDialog(null, "Lista vazia");
                     break;
                     
                     case 22: if((funt.length()>1))JOptionPane.showMessageDialog(null, "Mostrar Cadastros"+funt);
                     else JOptionPane.showMessageDialog(null, "Lista vazia");
                     break;
                     
                     case 23:if((estat.length()>1)) JOptionPane.showMessageDialog(null, "Mostrar Cadastros"+estat);
                     else JOptionPane.showMessageDialog(null, "Lista vazia");
                     break;
                     
                     case 31:  Aluno obja= new Aluno(); 
                         if(alu.isEmpty()){
                         JOptionPane.showMessageDialog(null, "Lista vazia");
                     }else{pesq=JOptionPane.showInputDialog(null, "Qual o nome do aluno?");
                            for (Pessoa alu1 : alu) {
                                if(alu1.getNome().equals(pesq)){
                                 JOptionPane.showMessageDialog(null, "Mostrar Cadastro\n\nNome:"+alu1.getNome()+"\nCurso:"+obja.getCurso());
                        
                                }else JOptionPane.showMessageDialog(null, "Nome não cadastrado");
                            }
         }
                            break;
                            
                     case 32:Funcionario obj1f= new Funcionario();
                         if(fun.isEmpty()){
                         JOptionPane.showMessageDialog(null, "Lista vazia");
                     }else{pesq=JOptionPane.showInputDialog(null, "Qual o nome do funcionário?");
                           for (Pessoa fun1 : fun){
                               if(fun1.getNome().equals(pesq)){
                                JOptionPane.showMessageDialog(null, "Mostrar Cadastro\n\nNome:"+fun1.getNome()+"\nCargo:"+obj1f.getCargo());  
                               }JOptionPane.showMessageDialog(null, "Nome não cadastrado");
                           }
                     }
                           break;
                           
                     case 33: Estagiario obj2e= new Estagiario();
                             
                     if(est.isEmpty()){
                         JOptionPane.showMessageDialog(null, "Lista vazia");
                     }else{
                         
                         boolean encontrado = false;
                         pesq= JOptionPane.showInputDialog(null, "Qual o nome do Estagiario?");
                         for(Pessoa esta1: est){
                                 if(esta1.getNome().equals(pesq)){
                                    JOptionPane.showMessageDialog(null, "Mostrar Cadastro\n\nNome:"+esta1.getNome()+"\nCurso:"+obj2e.getCurso()+"\nBolsa:"+obj2e.getBolsa()); 
                                 encontrado=true;
                                 }
                         }
                         if(!encontrado) 
                             JOptionPane.showMessageDialog(null, "Não encontrado");
                         
                         
                        }
                             break;
                             
                     case 99: System.exit(0);
                     
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
         }   
         
     }while(opc!=99);
   
 }   
}
