package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int TempoTotal;

    public int getTempoTotal() {
        return this.TempoTotal;
    }

//    public void inclui(Filme f) {
//        TempoTotal+= f.getDM();
//
//    }
//
//    public void inclui(Serie s) {
//        TempoTotal+= s.getDM();
//
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adcionando Duração em minutos De: " + titulo);
        this.TempoTotal += titulo.getDM();

    }
}
