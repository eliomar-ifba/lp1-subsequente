package aula05carrinhodecompra;

import java.time.LocalDateTime;

public class Pedido {
    int id;
    LocalDateTime data;
    String status;
    Produto produto;

    // Construtor vazio
    public Pedido() {}

    // Construtor cheio
    public Pedido(int id, LocalDateTime data, String status, Produto produto) {
        this.id = id;
        this.data = data;
        this.status = status;
        this.produto = produto;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.println("Pedido número: " + id);
        System.out.println("Data: " + data);
        System.out.println("Estado: " + status);
        if (produto != null) {
            produto.imprimirDados();
        }
    }
}
