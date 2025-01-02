package model;

public class Titulo implements Comparable<Titulo> {
     // atributos da classe
     private String nome;
     private int anoDeLancamento;
     private boolean incluidoPlano;
     private double avaliacao;
     private int totalDeAvaliacoes;
     private int duracaoMinutos;
    
    // construtor
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
    
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean incluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome; // “this” se refere ao objeto atual e não ao parâmetro do método
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
     
    // metódo
    public void exibeFichaTecnica() {
         System.out.println("\nNome do filme: " + nome);
         System.out.println("Ano de lançamento: " + anoDeLancamento);
     }
 
     public void avalia(double nota){
         avaliacao += nota;
         totalDeAvaliacoes++;
     }
 
     public double mediaDasAvaliacoes(){
         return avaliacao / totalDeAvaliacoes;
     }

    @Override
    public int compareTo(Titulo outroTitulo) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
