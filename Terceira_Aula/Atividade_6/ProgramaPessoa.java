import java.util.Scanner;

public class ProgramaPessoa {
      public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            Pessoa pessoa = new Pessoa();
            int escolhaUsuario;

            System.out.println("Digite o seu nome: ");
            pessoa.nome = scan.nextLine();
            System.out.println("Digite a sua idade: ");
            pessoa.idade = scan.nextInt();
            System.out.println("Digite o dia do seu nascimento: ");
            pessoa.dia = scan.nextInt();
            System.out.println("Digite o mes do seu nascimento: (Utilize o numero correspondente ao mes)");
            pessoa.mes = scan.nextInt();
            System.out.println("Digite o ano do seu nascimento: ");
            pessoa.anoDeNascimento = scan.nextInt();
            System.out.println("Digite o ano atual: ");
            pessoa.anoAtual = scan.nextInt();

            System.out.println(
                        "Escolha uma opcao: \n1- Calcular Idade\n2- InformarIdade\n3- Mudar data de nascimento");
            escolhaUsuario = scan.nextInt();

            pessoa.metodos(escolhaUsuario);

            scan.close();

      }
}
