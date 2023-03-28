import java.util.Scanner;

public class ProgramaProduto {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Produto produto = new Produto();

            System.out.println("Digite o nome do seu produto: ");
            produto.nome = scan.nextLine();

            System.out.println("Digite a quantidade de produtos comprados: ");
            produto.quantidadeProduto = scan.nextInt();

            System.out.println("Digite o preco do produto: (utilize virgula para os centavos)");
            produto.precoProduto = scan.nextDouble();

            System.out.println("\n----------------------------------------------\n");
            System.out.println("\nO produto comprado foi: " + produto.nome);
            System.out.println("A quantidade do produto foi: " + produto.quantidadeProduto + " unidades");
            produto.valorTotalProduto(produto.quantidadeProduto);

            System.out.println("\n----------------------------------------------\n");

            scan.close();
      }
}
