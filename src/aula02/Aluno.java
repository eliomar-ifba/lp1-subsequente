package aula02;

public class Aluno extends Object{
    String nome;
    Integer idade = 0;
    String matricula = "0";
    
    //método construtor vazio - padrão
    public Aluno(){
        this.nome = "fulano";
        System.out.println("chamou o construtor vazio");
    }
    
    //podemos ter vários métodos construtores 
    public Aluno(String n){
        this.nome = n;
    }
    
    public Aluno(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        
    }


    //funções (métodos) normais
    //todo método normal, ele tem: retorno - nome - parâmetros
    //chamamos isso de assinatura do método
    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula);

    }

    

    
    
}
