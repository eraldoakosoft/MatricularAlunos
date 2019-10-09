/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provap2poo;

import java.util.ArrayList;

/**
 *
 * @author erald
 */
public class Turma {
    private  String nome;
    private  int qtdAulas;
    ArrayList<Aluno> lista = new ArrayList<>();

    public Turma(String nome, int qtdAulas) {
        this.nome = nome;
        this.qtdAulas = qtdAulas;
    }
    
    
    
    
    
    boolean matricularAluno(Aluno al){
        
        if(lista.size()>20){
            System.out.println("Lista Cheia");
            return false;
        }else{
            for(int i=0; i<lista.size();i++){
                if(lista.get(i).getCodigo() == al.getCodigo()){
                    System.out.println("Codigo do aluno já existe");
                    return false;
                }
            }
        }
        
        al.setFaltas(0);
        al.setFaltas(0);
        lista.add(al);
        System.out.println(al.getNome() + " Matriculado com Sucesso!");
        
        return true;
    }
    

    
    
    public int buscarAluno(int codigo){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCodigo()==codigo){
                return i;
            }
        }
        return -1;
    }
    
    
    public boolean registrarFalta(int codigo){
        if(buscarAluno(codigo) == -1){
            System.out.println("Aluno Não Encontrado");
            return false;
        }
        lista.get(buscarAluno(codigo)).setFaltas(lista.get(buscarAluno(codigo)).getFaltas()+1);
        System.out.println(lista.get(buscarAluno(codigo)).getNome() + " Com " + lista.get(buscarAluno(codigo)).getFaltas()+" Faltas");
        return  true;
    }
    
    public boolean atribuirNota(int codigo, double media){
       if(media<0 || media>10){
           System.out.println("Nota " + media + " Não é Valida");
           return false;
       }else if(buscarAluno(codigo) == -1){
           System.out.println("Aluno não Encontado");
           return false;
       }else
           lista.get(buscarAluno(codigo)).setMediafinal(media);
           System.out.println("Nota atribuida com Sucesso");
           return true;
    }
    
    
    public void listaTodos(){
        System.out.println("============ "+ getNome()+" =============");
        for(int i=0;i<lista.size();i++ ){
            System.out.println("----------------------");
            System.out.println("Código " + lista.get(i).getCodigo());
            System.out.println("Nome " + lista.get(i).getNome());
            System.out.println("Nota Final " + lista.get(i).getMediafinal());
            System.out.println("Falstas " + lista.get(i).getFaltas());
        }
        System.out.println("============ "+ getNome()+" =============");
    }
    
    public void ListarAprovados(){
        System.out.println("Alunos Aprovados no Curdo de " + getNome());
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getMediafinal() >= 6 && (lista.get(i).getFaltas() <= 60*0.25)){
                System.out.println("Nome " + lista.get(i).getNome());
                
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }
    
    
    
    
    
    
}
