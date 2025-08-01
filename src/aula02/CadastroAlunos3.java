package aula02;

import java.util.Date;

public class CadastroAlunos3 {
    public static void main(String[] args) {
        //sempre no comando new é invocado o método padrão da classe
        // esse método padrão chamamos de método construtor
        // ele é sempre invocado no momento do new
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno("João");
        Aluno aluno4 = new Aluno("José", 50, "1000");

        aluno1.imprimirDados();
        aluno2.imprimirDados();
        aluno3.imprimirDados();
        aluno4.imprimirDados();


    }
}
