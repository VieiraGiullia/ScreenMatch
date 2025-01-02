package model;

import calculo.Classificavel;

public class Episodio implements Classificavel{
    private int num;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }
    public void setTotalVisualizacoes(int totalVisualizacoes ) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
