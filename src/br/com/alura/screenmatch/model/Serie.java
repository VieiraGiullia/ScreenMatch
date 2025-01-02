package model;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosTemporada;
    private int minutosPorTemporada;

    public Serie(String nome, int anoDeLancamento) { super(nome, anoDeLancamento);}
    public int getTemporadas() {
        return temporadas;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }
    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }
    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodiosTemporada * minutosPorTemporada;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
