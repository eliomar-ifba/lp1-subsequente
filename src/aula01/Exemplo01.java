package aula01;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] a) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("\tOlá mundo " + nome + "!" + (5-10) + -10);
            
        System.out.print("qual a sua idade? ");
        int idade = teclado.nextInt();
        System.out.println("Legal ter " + idade + " anos");
    }
}
