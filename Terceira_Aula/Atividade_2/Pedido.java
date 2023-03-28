public class Pedido {
      Produto produto = new Produto();

      int quantidadeProduto;
      double valorTotal;

      FormaPagamento formaPagamento = new FormaPagamento();

      double valorPedido() {
            return this.valorTotal = this.quantidadeProduto * this.produto.valorProduto;
      }

}
