package aula04;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println("nome: " + aluno.nome);

        aluno.nome = "Mari";
        System.out.println("nome: " + aluno.nome);

        Aluno aluno2 = new Aluno("Goku");
        aluno2.nome = "Madimbu";
        System.out.println("Nome: " + aluno2.nome);

        Aluno aluno3 = new Aluno(10, "josé", 90, null);
        System.out.println("Nome: " + aluno3.nome);
        


    }
}
