package aula04;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        Matricula m = new Matricula();
        m.id = 1;
        m.status = "Pendente";
        m.numero = "2025.222.0001";
        m.dataHora = LocalDateTime.now();

        Matricula m2 = new Matricula();

        Aluno aluno = new Aluno();
        aluno.id = 10;
        aluno.idade = 35;
        aluno.nome = "José Cícero";
        aluno.matricula = m;
        
        Aluno aluno2 = new Aluno();
        aluno2.id = 15;
        aluno2.idade = 50;
        aluno2.nome = "Maria";
        aluno2.matricula = m;

        // Métodos proporcionam 
        // Reaproveitamento de código (código limpo)
        // Manutenção rápida e segura (solidez)
        System.out.println("\n\n##### Alunos #####");
        
        aluno.imprimirDados(1);
        aluno2.imprimirDados(2);
    
        
        
    }
}
