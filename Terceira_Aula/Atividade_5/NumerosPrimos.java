import java.util.Scanner;

public class NumerosPrimos {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int quantidadeDivisores = 0;

            System.out.println("Digite um numero inteiro: ");
            int numeroDigitado = scan.nextInt();

            for (int i = 1; i <= numeroDigitado; i++) {
                  if (numeroDigitado % i == 0) {
                        quantidadeDivisores++;
                  }

            }
            if (quantidadeDivisores == 2) {
                  System.out.println("Numero " + numeroDigitado + " primo");
            } else {
                  System.out.println("Numero " + numeroDigitado + " nao e primo");
            }

            scan.close();
      }

}