
class Produto {
      String nome;
      int quantidadeProduto;
      double precoProduto;

      double valorDesconto;

      double valorTotal;

      void valorTotalProduto(int qtdProduto) {
            if (qtdProduto <= 10) {
                  valorTotal = qtdProduto * precoProduto;
                  System.out.println("O valor total da compra foi: R$" + valorTotal);
            } else if (qtdProduto >= 11 && qtdProduto <= 20) {
                  valorDesconto = ((qtdProduto * precoProduto) * 10) / 100;
                  valorTotal = (qtdProduto * precoProduto) - valorDesconto;

                  System.out.println("Produto com 10% de desconto");
                  System.out.println("O Valor total da compra foi: R$" + valorTotal);
            } else if (qtdProduto >= 21 && qtdProduto <= 50) {
                  valorDesconto = ((qtdProduto * precoProduto) * 20) / 100;
                  valorTotal = (qtdProduto * precoProduto) - valorDesconto;

                  System.out.println("Produto com 20% de desconto");
                  System.out.println("O Valor total da compra foi: R$" + valorTotal);
            } else if (qtdProduto > 50) {
                  valorDesconto = ((qtdProduto * precoProduto) * 25) / 100;
                  valorTotal = (qtdProduto * precoProduto) - valorDesconto;

                  System.out.println("Produto com 25% de desconto");
                  System.out.println("O Valor total da compra foi: R$" + valorTotal);
            } else {
                  System.out.println("Valor Invalido");
            }
      }

}