package aula02;

public class CadastroAlunos2 {
    public static void main(String[] args) {

        //Exemplo trabalhando o acesso e preenchimento
        // dos objetos através de suas variáveis

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Eliomar";
        aluno1.idade = 37;
        aluno1.matricula = "10101010";

        aluno2.nome = "Marivaldo";
        aluno2.idade = 34;
        aluno2.matricula = "20202020";

        System.out.println("---- Aluno 01 ----");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("Matrícula: " + aluno1.matricula);
        
        System.out.println("---- Aluno 02 ----");
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Idade: " + aluno2.idade);
        System.out.println("Matrícula: " + aluno2.matricula);

        System.out.println("End memória aluno1: " + aluno1.toString());
        System.out.println("End memória aluno2: " + aluno2);



    }
}
