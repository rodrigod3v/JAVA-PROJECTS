import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite Seu filme Favorito : ");
        String filme = leitura.nextLine();
        System.out.println("Ano de Lançamento");
        int anodelancamento = leitura.nextInt();
        System.out.println("Avaliaçao do Filme :");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anodelancamento);
        System.out.println(avaliacao);


    }
}
