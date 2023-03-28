import java.util.Scanner;

public class Pessoa {

      Scanner scan = new Scanner(System.in);

      String nome;
      int idade;
      int dia;
      int mes;
      int anoDeNascimento;
      int anoAtual;

      void metodos(int escolhaUsuario) {
            if (escolhaUsuario == 1) {
                  this.idade = anoAtual - anoDeNascimento;
                  System.out.println("Sua idade atual: " + idade + " anos");
            } else if (escolhaUsuario == 2) {
                  System.out.println("Sua idade: " + idade + " anos");
            } else {
                  System.out.println("Digite o dia do seu nascimento: ");
                  dia = scan.nextInt();
                  System.out.println("Digite o mes do seu nascimento: ");
                  mes = scan.nextInt();
                  System.out.println("Digite o ano do seu nascimento: ");
                  anoDeNascimento = scan.nextInt();
                  System.out.println("\nSua data de nascimento: " + dia + "/" + mes + "/" + anoDeNascimento);
            }
      }
}