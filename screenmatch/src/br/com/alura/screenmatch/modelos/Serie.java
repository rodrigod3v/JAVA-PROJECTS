package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
private int temp;   ///TEMPORADA
private boolean ativa;
private int EPT;  /// EPISODIOS POR TEMPORADA
private int MPE;  /// MINUTOS POR EPISODIO

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEPT() {
        return EPT;
    }

    public void setEPT(int EPT) {
        this.EPT = EPT;
    }

    public int getMPE() {
        return MPE;
    }

    public void setMPE(int MPE) {
        this.MPE = MPE;
    }

    @Override
    public int getDM() {
        return temp * EPT * MPE;
    }
}
