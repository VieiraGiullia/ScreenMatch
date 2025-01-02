package calculo;

import model.Titulo;
import model.Serie;
import model.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
    return tempoTotal;
    }

    // public void inclui(Filme f) {
    //     this.tempoTotal += f.getDuracaoMinutos();
    // }

    // public void inclui(Serie s) {
    //     this.tempoTotal += s.getDuracaoMinutos();
    // }
    public void inclui(Titulo titulo) {
        // shift + alt + o para limpar e atualizar os imports q estão sendo usados
        System.out.println("Adicionando a duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
