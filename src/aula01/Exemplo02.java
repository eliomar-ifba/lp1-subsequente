package aula01;

public class Exemplo02 {
    public static void main(String[] args) {

        int idade = 37; //primitivo 
        Integer idade2 = 37; //classe wrapper (invólucro)
        Integer idadeTemp = idade; // a partir da versão 5 do java, a conversao (cast) do tipo primitivo pra classe é automática
        idade = idadeTemp; //o contrário também

        double altura = 1.85; //primitiva
        Double altura2 = 1.85; // wrapper
        altura = altura2; //conversão (cast) automática 
        altura2 = altura; //o contrário (cast) também converte

        String idadeTexto = "37";
        idade = Integer.parseInt(idadeTexto);

        String alturaTexto = "1.85";
        altura = Double.parseDouble(alturaTexto);

        boolean ativo = true;
        Boolean ativo2 = false;
        ativo = ativo2;
        ativo2 = ativo;

        //convertendo de numérico para String
        //sempre que concatenamos qualquer tipo com uma String, ou seja, aspas, 
            // todo o contexto se torna String
        alturaTexto = altura + "";
        alturaTexto = String.valueOf(altura); //casting usando a classe

    }
}
