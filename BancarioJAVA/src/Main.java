import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Thread.sleep;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        ArrayList<Integer> Bank = new ArrayList<>();
        ArrayList<String> account = new ArrayList<>();
        boolean active = true;
        while (active) {
            System.out.println("===Gerenciador Bancário===");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha a função:\n" +
                    "1 - Cadastrar Contas\n" +
                    "2 - Realizar Depósitos \n" +
                    "3 - Realizar Saques\n" +
                    "4 - Consultar Saldo\n" +
                    "5 - Consultar Histórico de Movimentações\n" +
                    "6 - Transferir entre Contas\n" +
                    "7 - Sair");
            String option = scanner.nextLine();


            switch (option) {
                case "debug":
                    System.out.println("===Dev View===");
                    System.out.println(Bank);
                    System.out.println(account);
                    System.out.println("===Dev View===");
                    break;

                case "1":

                    System.out.println("===Gerenciador Bancário===");
                    System.out.println("Digite o nome da nova conta:");
                    String name = scanner.nextLine();
                    System.out.println("A conta " + name + " foi criada com sucesso!");
                    account.add(name);
                    Bank.add(0);
                    break;

                case "2":

                    System.out.println("===Gerenciador Bancário===");
                    System.out.println("Digite a posição da conta");
                    System.out.println(account);
                    String position = scanner.nextLine();
                    System.out.println(account);
                    int positback = Integer.parseInt(position) - 1;
                    System.out.println("Digite a quantia a ser depositada:");
                    String quant = scanner.nextLine();
                    int quantback = Integer.parseInt(quant);
                    Bank.set(positback, quantback);
                    System.out.println("A quantia de " + quant + " foi depositada ");
                    System.out.println(account.get(positback) + ": " + (quantback));
                    break;

                case "3":

                    System.out.println("===Gerenciador Bancário===");
                    System.out.println("Digite a posição da conta");
                    System.out.println(account);
                    String position_ = scanner.nextLine();
                    System.out.println(account);
                    int positback_ = Integer.parseInt(position_) - 1;
                    System.out.println("Digite a quantiade a ser sacada:");
                    String saque = scanner.nextLine();
                    int saqueback = Integer.parseInt(saque);
                    int operation = Bank.get(positback_) - saqueback;
                    Bank.set(positback_, operation);
                    System.out.println("A quantia de " + saqueback + " foi sacada de sua conta");
                    break;

                case "4":

                    System.out.println("===Gerenciador Bancário===");
                    System.out.println("Digite a posição da conta");
                    System.out.println(account);
                    String positions = scanner.nextLine();
                    int saqback = Integer.parseInt(positions) - 1;
                    System.out.println("SALDO DISPONÍVEL:");
                    System.out.println(Bank.get(saqback));
                    break;

                case "5":

                case "6":

                    System.out.println("===Gerenciador Bancário===");
                    System.out.println("Digite a posição da sua conta");
                    String positionm = scanner.nextLine();
                    int positonmback = Integer.parseInt(positionm)-1;
                    System.out.println("Digite a posição da conta a ser transferida:");
                    String positionm2 = scanner.nextLine();
                    int positonmback2 = Integer.parseInt(positionm2)-1;
                    System.out.println("Digite o valor da transferencia");
                    String valor = scanner.nextLine();
                    int valorback = Integer.parseInt(valor);
                    int subacconut = Bank.get(positonmback) - valorback;
                    int plusaccount = Bank.get(positonmback2)+ valorback;
                    Bank.set(positonmback,subacconut);
                    Bank.set(positonmback2,plusaccount);
                    System.out.println("A transação de" + valorback + "foi realizado para " + positonmback2);
                    System.out.println("SALDO DISPONÍVEL:");
                    System.out.println(Bank.get(positonmback));
                    break;


            }


        }
    }
}
