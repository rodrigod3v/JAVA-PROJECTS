import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Julia";
        String tipoConta = "Conta Corrente";
        double saldo = 3000.90;
        int opcao = 0;

        System.out.println("\nSEJA BEM-VINDO(A) AO JABANK, SEU FUTURO DEPOSITADO EM NÓS");
        System.out.println("_____________________________________");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("\n______________________________________");

        String menu = """
                Digite sua opção
                1- Consultar meu saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Saldo Atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Valor da Transferencia: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo Insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Mensagem invalida");
            } else if (opcao == 4) {
                System.out.println("Obrigado por usar o JABANK, até a proxima! :)");

            }
        }
    }
}