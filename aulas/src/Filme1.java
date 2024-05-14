///////////////////////////////////
//ADL = ANO DE LANCAMENTO
//INP = INCLUSO NO PLANO DO CLIENTE
//NDF = NOTA DO FILME
///////////////////////////////////
public class Filme1 {
    public static void main(String[] args) {
        System.out.printf("Screen Match");

        System.out.println("Filme: Taxi Driver");
        int ADL = 1976;
        System.out.println("Ano de Lançamento : " + ADL);
        double NDF = 9.1;
        System.out.println("Nota do Filme : " + NDF);
        boolean INP = true;
        System.out.println("Incluso no seu Plano? " + INP);

        double media = (9.8 + 6.3 + 8.9) /3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme de Ficçao e aventura
                Otimos produtores
                """;
        System.out.println(sinopse);

        /// MEDIA DE CLASSIFICAÇAO PARA IMPRIMIR QUANTAS ESTRELAS TEM O FILME

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}