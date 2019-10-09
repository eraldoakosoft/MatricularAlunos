/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provap2poo;

/**
 *
 * @author erald
 */
public class Aluno {
    private int codigo;
    private String nome;
    private double mediafinal;
    private int faltas;
    

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.mediafinal = 0;
        this.faltas = 0;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediafinal() {
        return mediafinal;
    }

    public void setMediafinal(double mediafinal) {
        this.mediafinal = mediafinal;
    }
    
    
    
    
}
