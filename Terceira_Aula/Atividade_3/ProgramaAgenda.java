import java.util.Scanner;

public class ProgramaAgenda {

      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Contato contato = new Contato();
            System.out.println("\nDigite o nome do contato: ");
            contato.nome = scan.nextLine();
            System.out.println("\nDigite o telefone: ");
            contato.telefone = scan.nextLine();

            System.out.println("\n-----------Contato Salvo----------\n");
            System.out.println("Nome do contato: " + contato.nome);
            System.out.println("Telefone do contato: " + contato.telefone);

            System.out.println("\n----------------------------------");

            scan.close();
      }
}