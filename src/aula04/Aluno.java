package aula04;

public class Aluno {
    Integer id;
    String nome;
    Integer idade;
    Matricula matricula;

    // MÉTODOS CONSTRUTORES
    // tem dois objetivos: 
        // 1º - criar a instância (objeto) 
        // 2º - aplicar algum comportamento
    // sua assinatura é diferente (não tem retorno)
        // e o nome é sempre igual ao da classe
    public Aluno(){
        System.out.println("\n\nchamou o construtor!");
        nome = "fulano";
       
    }

    public Aluno(String nome){
        this.nome = nome; 
    }

    public Aluno(int id, String nome, int idade, Matricula matricula){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }


    // Assinatura do método tem...
    // proteção + retorno + nome + parâmetros
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula Código: " + matricula.numero);
        System.out.println("Matricula Status: " + matricula.status);
        System.out.println("Matricula Data: " + matricula.dataHora);
        System.out.println();
    }

    // sobrecarga de métodos
    // a OO permite declarar métodos com a mesma assinatura
    // porém, com parâmetros distintos
    public void imprimirDados(int ordem){
        System.out.println("Aluno: " + ordem);
        imprimirDados();
    }




}
