import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class Principal {

    public static void main(String[] args) {
       Filme meuFilme = new Filme();
        meuFilme.setNome("Clube da Luta");
        meuFilme.setADL(1999);
        meuFilme.setDM(139);
        meuFilme.EFT();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(" TOTAL DAS AVALIAÇOES : " + meuFilme.getTotalAvaliacoes());
        System.out.println(" Media : " + meuFilme.PM());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setADL(2004);
        lost.EFT();
        lost.setTemp(10);
        lost.setEPT(10);
        lost.setMPE(50);
     System.out.println(" Tempo Para Maratonar Lost: " + lost.getDM());


     Filme outrofilme = new Filme();
     outrofilme.setNome("Taxi Driver");
     outrofilme.setADL(2000);
     outrofilme.setDM(200);
     CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
     calculadora.inclui(meuFilme);
     calculadora.inclui(outrofilme);
     calculadora.inclui(lost);
     System.out.println("Tempo Taxi Driver: " + calculadora.getTempoTotal());

     FiltroRecomendacao filtro = new FiltroRecomendacao();
     filtro.filtra(meuFilme);

     Episodio episodio = new Episodio();
     episodio.setNumero(1);
     episodio.setSerie(lost);
     episodio.setTotalViews(300);
     filtro.filtra(episodio);



    }
}
