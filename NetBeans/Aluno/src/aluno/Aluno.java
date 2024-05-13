/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno;

/**
 *
 * @author CAMARGO
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlunoObj alunol;
        
        alunol = new AlunoObj ();
        
        alunol.setNome ("Lucas Lira");
        System.out.println(alunol.getnome());
        
        
        alunol.setIdade (16);
        System.out.println(alunol.getIdade());
                
    }
   