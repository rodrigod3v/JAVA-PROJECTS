import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int TotalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação do Filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media += nota;
                TotalDeNotas ++;
            }

        }
        System.out.println("Media de avaliações: " + media /TotalDeNotas);

    }
}