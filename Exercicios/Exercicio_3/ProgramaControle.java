
public class ProgramaControle {
      public static void main(String[] args) {

            Emprestimo emprestimo = new Emprestimo();

            emprestimo.pessoa.nomeSobrenome = "Katiana Hanisch";
            emprestimo.pessoa.idade = 19;
            emprestimo.livro.nomeLivro = "Pequeno principe";
            emprestimo.livro.autorLivro = "Antoine de Saint-Exupery";
            emprestimo.livro.quantidadePaginas = 109;
            emprestimo.statusLivro = "Devolvido";

            System.out.println("\n-----------------Lista de Emprestimos-------------\n");
            System.out.println("Nome pessoa : " + emprestimo.pessoa.nomeSobrenome);
            System.out.println("Idade pessoa : " + emprestimo.pessoa.idade);
            System.out.println("Nome Livro : " + emprestimo.livro.nomeLivro);
            System.out.println("Autor Livro : " + emprestimo.livro.autorLivro);
            System.out.println("Quantidade de paginas Livro : " + emprestimo.livro.quantidadePaginas);
            System.out.println("Situacao do livro: " + emprestimo.statusLivro);
            System.out.println("\n----------------------------------------\n");

      }
}
