import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "luan";
        String tipoDeConta = "Corrente";
        double saldo = 1600.00;
        int opcaoServico = 0;
        int opcaoEntrada = 0;
        String bemVindo = """
                Seja bem vindo ao App do ByteBank
                
                1- Entrar
                2- Cadastre-se
                """;
        String menu = """
                    \n** Digite sua Opcao **
                    1 - Consultar saldo
                    2 - Tranferir Valor 
                    3 - Depositar Valor
                    4 - sair
                    
                    """;
        String valorTransferido = """
                O valor foi tranferido com sucesso!
                Saldo atual da conta = """;

        String valorDepositado = """
                O valor foi Depositado com sucesso!
                Saldo atual da conta = """;




        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        Scanner leitura = new Scanner(System.in);

        while (opcaoServico != 4){
            System.out.println(menu);
            opcaoServico = leitura.nextInt();

            if (opcaoServico == 1){
                System.out.println("Seu saldo = "+saldo);
            } else if (opcaoServico == 2) {
                System.out.println("Qual o Valor que deseja Transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("O valor Insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println(valorTransferido + saldo);
                }
            } else if (opcaoServico == 3) {
                System.out.println("Digite o Valor de Deposito:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println(valorDepositado + saldo);
            } else if (opcaoServico != 4) {
                System.out.println("Opcao invalida, tente novamente");
            }
        }

    }
}
