
public class Contador {
      int quantidadeContador;

      void escolherMetodos(int valorUsuario) {
            if (valorUsuario == 1) {
                  this.quantidadeContador = 0;
                  System.out.println("\n---------------------------------------------");
                  System.out.println("\nValor contador: " + quantidadeContador);
                  System.out.println("\n---------------------------------------------");

            } else if (valorUsuario == 2) {
                  this.quantidadeContador = this.quantidadeContador + 1;
                  System.out.println("\n---------------------------------------------");
                  System.out.println("\nNovo valor contador: " + quantidadeContador);
                  System.out.println("\n---------------------------------------------");

            } else if (valorUsuario == 3) {
                  System.out.println("\n---------------------------------------------");
                  System.out.println("\nValor contador: " + quantidadeContador);
                  System.out.println("\n---------------------------------------------");

            } else {
                  System.out.println("Escolha inválida");
            }
      }
}
