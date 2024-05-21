package br.com.alura.screenmatch.modelos;

import java.io.Serializable;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int ADL; /////ANO DE LANCAMENTO
    private int DM; /////DURACAO EM MINUTOS
    private boolean INP;  //// INCLUIDO NO PLANO
    private double SDA;  /// SOMA DAS AVALIAÇOES
    private int totalAvaliacoes;

    public Titulo(String nome, int ADL) {
        this.nome = nome;
        this.ADL = ADL;
    }

    public Titulo() {
    }

    public String getNome() {
        return nome;
    }

    public int getADL() {
        return ADL;
    }

    public int getDM() {
        return DM;
    }

    public boolean isINP() {
        return INP;
    }

    public void EFT(){
        System.out.println(" Nome : " + nome);
        System.out.println(" Ano de Lançamento: " + ADL);
        System.out.println(" Duração do Filme Em Minutos: " + DM);

    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void avalia(double nota){
        SDA += nota;
        totalAvaliacoes++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setADL(int ADL){
        this.ADL = ADL;
    }
    public void setDM(int DM){
        this.DM = DM;
    }
    public void setINP(boolean INP){
        this.INP = INP;
    }

    public double PM(){           /// PEGAR MEDIA
        return SDA / totalAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
