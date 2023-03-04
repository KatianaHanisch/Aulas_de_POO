import java.util.Scanner;

public class Aula {
      public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            double media = 0;

            System.out.println("Digite sua N1:");
            double n1 = entrada.nextDouble();
            System.out.println("Digite sua N2:");
            double n2 = entrada.nextDouble();
            System.out.println("Digite sua N3:");
            double n3 = entrada.nextDouble();

            media = (n1 + n2 + n3) / 3;

            if (media < 4) {
                  System.out.println("Voce foi Reprovado!\nSua media foi " + media);
            } else if (media >= 4 && media < 7) {
                  System.out.println("Voce ficou de Exame!\nSua media foi " + media);
            } else {
                  System.out.println("Voce foi Aprovado!\nSua media foi " + media);
            }
      }
}