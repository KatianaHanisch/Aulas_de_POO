import java.util.Scanner;

public class ProgramaContador {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Contador contador = new Contador();

            contador.quantidadeContador = 0;

            System.out.println("\nValor atual do contador: " + contador.quantidadeContador);
            System.out.println(
                        "\nEscolha um metodo: \n\n1- Zerar contador\n2- Aumentar contador\n3- Retornar valor do contador\n4- Sair do Programa");

            int escolhaUsuario = scan.nextInt();

            while (escolhaUsuario != 4) {
                  contador.escolherMetodos(escolhaUsuario);

                  System.out.println(
                              "\nEscolha um metodo: \n\n1- Zerar contador\n2- Aumentar contador\n3- Retornar valor do contador\n4- Sair do programa");
                  escolhaUsuario = scan.nextInt();

            }

            scan.close();

      }
}