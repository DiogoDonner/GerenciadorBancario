import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
            if (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4") && !option.equals("5") && !option.equals("6") && !option.equals("7")) {
                System.out.println("Operação não reconhecida");
            } else {

                switch (option) {
                    case "1":
                        System.out.println("===Gerenciador Bancário===");
                        System.out.println("Digite o nome da nova conta:");
                        String name = scanner.nextLine();
                        System.out.println("A conta " + name + " foi criada com sucesso!");
                        account.add(name);
                        break;

                }

            }
        }
    }
}