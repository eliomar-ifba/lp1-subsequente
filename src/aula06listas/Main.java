package aula06listas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.id = 1;
        produto1.nome = "Feijão";
        produto1.valor = 7.5;

        produto2.id = 2;
        produto2.nome = "Arroz";
        produto2.valor = 5.49; 
        
        produto3.id = 3;
        produto3.nome = "Macarrão";
        produto3.valor = 2.39;
        
        List<Produto> cestaadeProdutos = new ArrayList<>(); 
        cestaadeProdutos.add(produto1);
        cestaadeProdutos.add(produto2);
        cestaadeProdutos.add(produto3);
        

        Pedido pedido = new Pedido();
        pedido.id = 1;
        pedido.data = LocalDateTime.now();
        pedido.status = "Finalizado";
        pedido.valorTotal = 15.5;
        pedido.produtos = cestaadeProdutos;

        // System.out.println(" *** CUPOM FISCAL *** ");
        // System.out.println(" ID: " + pedido.id);
        // System.out.println(" Data: " + pedido.data);
        // System.out.println(" Status: " + pedido.status);
        // System.out.println(" Valor total: " + pedido.status);

        // System.out.println(" *** ITENS *** ");
        // System.out.println(" Nome Produto: " + pedido.produtos.get(0).nome);
        // System.out.println(" Valor Produto: " + pedido.produtos.get(0).valor);
               
        // System.out.println(" *** ITENS *** ");
        // System.out.println(" Nome Produto: " + pedido.produtos.get(1).nome);
        // System.out.println(" Valor Produto: " + pedido.produtos.get(1).valor);

        // System.out.println(" *** ITENS *** ");
        // System.out.println(" Nome Produto: " + pedido.produtos.get(2).nome);
        // System.out.println(" Valor Produto: " + pedido.produtos.get(2).valor);


        //fantagens do for each simplificar enão repetir os gets.
        for(Produto p : pedido.produtos){
            System.out.println(" Nome Produto: " + p.nome);
            System.out.println(" Valor Produto: " +p.valor);
        }
    }
}
