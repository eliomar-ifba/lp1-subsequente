package aula05carrinhodecompra;

    public class Produto {
        Integer id;
        String nome;
        double valor;
            
        // Construtor vazio
        public Produto() {}
    
        // Construtor cheio
        public Produto(Integer id, String nome, double valor) {
            this.id = id;
            this.nome = nome;
            this.valor = valor;
        }
    
        // Método para imprimir os dados
        public void imprimirDados() {
            System.out.println("Numero: " + id);
            System.out.println("Produto " + nome);
            System.out.println("Valor: R$" + valor);
        }
    }
    
