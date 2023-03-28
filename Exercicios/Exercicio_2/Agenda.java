import java.util.Scanner;

public class Agenda {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Contato contato = new Contato();

            System.out.println("Digite o nome do contato que deseja salvar: ");
            contato.nome = scan.nextLine();
            System.out.println("Digite o telefone do seu contato: ");
            contato.telefone = scan.nextLine();

            System.out.println("\n----------------------------------------------\n");
            System.out.println("Contato Salvo\n");
            System.out.println("Nome: " + contato.nome);
            System.out.println("Telefone: " + contato.telefone);
            System.out.println("\n----------------------------------------------\n");

            scan.close();
      }
}
