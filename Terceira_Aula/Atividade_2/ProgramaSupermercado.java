public class ProgramaSupermercado {
      public static void main(String[] args) {

            Pedido pedido = new Pedido();

            pedido.produto.descricao = "Amaciante";
            pedido.quantidadeProduto = 10;
            pedido.produto.valorProduto = 10.00;
            pedido.formaPagamento.tipoPagamento = "dinheiro";

            System.out.println("Produto: " + pedido.produto.descricao);
            System.out.println("Quantidade Produto: " + pedido.quantidadeProduto);
            System.out.println("Valor de cada item: " + pedido.produto.valorProduto);
            System.out.println("Forma de pagamento: " + pedido.formaPagamento.tipoPagamento);

            System.out.println("Valor total do pedido: " + pedido.valorPedido());

      }
}