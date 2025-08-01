package aula02;

public class CadastroAlunos {
    public static void main(String[] args) {
        /*a primeira grande vantagem da orientação a objetos
            é que podemos criar vários cadastros ou objetos
            a partir de uma mesma fonte (forma)
            e assim evitando repetição de código
        */
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno();

        for(int i = 0; i >= 10; i = i + 2){
            Aluno a = new Aluno();
        }

        
    }
}
