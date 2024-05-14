package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacoes() >= 9){
           System.out.println(audio.getTitulo() + "  Sucesso Absoluto" + "  Muito Tocada em nossa plataforma");
        } else {
            System.out.println(audio.getTitulo() + "  Com muitas Curtidas!");
        }
    }
}
