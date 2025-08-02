package aula05carrinhodecompra;

import java.time.LocalDateTime;

public class CadastroPedidoProduto {
    public static void main(String[] args) {
        // Produto e pedido via construtor
        Produto produto1 = new Produto(1, "Fone Bluetooth", 150.00);
        Pedido pedido1 = new Pedido(1, LocalDateTime.now(), "Aprovado", produto1);

        // Produto e pedido via set manual (sem construtor)
        Produto produto2 = new Produto();
        produto2.id = 2;
        produto2.nome = "Tablet 10'";
        produto2.valor = 1250;
      

        Pedido pedido2 = new Pedido();
        pedido2.id = 2;
        pedido2.status = "Pendente";
        pedido2.data = LocalDateTime.now() ;
        pedido2.produto = produto2;

        // Impressão dos dados
        System.out.println("\n____ Pedido 1 ____");
        pedido1.imprimirDados();
        System.out.println("__________________");
        System.out.println("\n____ Pedido 2 ____");
        pedido2.imprimirDados();
        System.out.println("__________________");

    }
}

