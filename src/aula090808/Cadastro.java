package aula090808;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Cadastro {
    public static void main(String[] args) {
        Endereco end = new Endereco();
        Estadio estadio = new Estadio();
        Partida partida = new Partida();
        Time mandante = new Time();
        Time visitante = new Time();
        Jogador jog1 = new Jogador();
        Jogador jog2 = new Jogador();
        Jogador jog3 = new Jogador();
        Jogador jog4 = new Jogador();
        Jogador jog5 = new Jogador();
        Jogador jog6 = new Jogador();

        end.setId(UUID.randomUUID());
        end.setRua("Barcelona");
        end.setBairro("BNH");

        estadio.setId(UUID.randomUUID());
        estadio.setNome("Maracanã");
        estadio.setEndereco(end);

        jog1.setId(UUID.randomUUID());
        jog1.setNome("Marcos");
        jog1.setNumero("11");
        
        jog2.setId(UUID.randomUUID());
        jog2.setNome("Zico");
        jog2.setNumero("10");

        jog3.setId(UUID.randomUUID());
        jog3.setNome("Andrade");
        jog3.setNumero("9");
        
        jog4.setId(UUID.randomUUID());
        jog4.setNome("maradona");
        jog4.setNumero("10");
        
        jog5.setId(UUID.randomUUID());
        jog5.setNome("Ronaldo");
        jog5.setNumero("9");
        
        jog6.setId(UUID.randomUUID());
        jog6.setNome("Pelé");
        jog6.setNumero("7");

        mandante.setId(UUID.randomUUID());
        mandante.setNome("Flamengo");
        mandante.setJogadores(List.of(jog1, jog2, jog3));

        visitante.setId(UUID.randomUUID());
        visitante.setNome("Vasco");
        visitante.setJogadores(List.of(jog4, jog5, jog6));

        partida.setId(UUID.randomUUID());
        partida.setData(LocalDateTime.of(2025, 10, 30, 21, 30, 0));
        partida.setEstadio(estadio);
        partida.setTimeMandante(mandante);
        partida.setTimeVisitante(visitante);

        //IMPRESSÃO
        System.out.println("###### Dados da partida ######");
        System.out.println("ID: " + partida.getId());
        System.out.println("Data: " + partida.getData());
        System.out.println("Estádio: " + partida.getEstadio().getNome());
        System.out.println("Endereço: " + partida.getEstadio().getEndereco().getRua() + ", Bairro: " + partida.getEstadio().getEndereco().getBairro());
        System.out.println("Time mandante: " + partida.getTimeMandante().getNome());
        System.out.println("Time visitante: " + partida.getTimeVisitante().getNome());

        System.out.println("\n*** Jogadores do time mandante ***");
        for(Jogador j : partida.getTimeMandante().getJogadores()){
            System.out.println("ID: " + j.getId());
            System.out.println("Nome: " + j.getNome());
            System.out.println("Número: " + j.getNumero());
            System.out.println("-------------------------");
        }

        System.out.println("\n*** Jogadores do time visitante ***");
        for(Jogador j : partida.getTimeVisitante().getJogadores()){
            System.out.println("ID: " + j.getId());
            System.out.println("Nome: " + j.getNome());
            System.out.println("Número: " + j.getNumero());
            System.out.println("-------------------------");
        }


        
        
    }
}
