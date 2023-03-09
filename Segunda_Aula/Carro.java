public class Carro {

      String fabricante;
      String modelo;
      String cor;
      int anoDeFabricacao;
      boolean ligacao;
      int kmRodado = 0;
      boolean ligado = false;

      void ligar() {
            if (ligado) {
                  return;
            } else {
                  System.out.println("Carro ligando");
                  ligado = true;
            }
      }

      void desligar() {
            if (!ligado) {
                  return;
            } else {
                  System.out.println("Carro Desligando");
                  ligado = false;
            }
      }

      String ResumoCarro() {
            return modelo + " - " + anoDeFabricacao;
      }

      void Rodar(int kmRodado) {
            this.kmRodado = this.kmRodado + kmRodado;
      }

      Entidade proprietario = new Entidade();
      Entidade comprador = new Entidade();
}