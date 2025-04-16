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
                        int positback = Integer.parseInt(position)-1;
                        System.out.println("Digite a quantia a ser depositada:");
                        String quant = scanner.nextLine();
                        int quantback = Integer.parseInt(quant);
                        System.out.println("Processando...");
                        Bank.set(positback, quantback);
                        System.out.println("A quantia de " + quant + " foi depositada ");
                        System.out.println(account.get(positback)+": "+(quantback));
                        break;






            }
        }
    }
}