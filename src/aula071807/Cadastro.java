package aula071807;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cadastro {
    public static void main(String[] args) {
        Musica m1 = new Musica();
        m1.setId(UUID.randomUUID());
        m1.setTitulo("Faroeste Caboclo");
        m1.setAutor("Legião Urbana");

        Musica m2 = new Musica();
        m2.setId(UUID.randomUUID());
        m2.setTitulo("Olho no gato");
        m2.setAutor("Marina Senna");

        List<Musica> lista = new ArrayList<>();
        lista.add(m2);
        lista.add(m1);

        Playlist playlist = new Playlist();
        playlist.setId(UUID.randomUUID());
        playlist.setNome("relaxar");
        playlist.setPublica(true);
        playlist.setQtdMusicas(0);
        playlist.setTotalDuracaoSeg(0);
        playlist.setDataCriacao(LocalDateTime.now());

        playlist.setMusicas(lista);

        System.out.println("Nome: " + playlist.getNome());
        System.out.println("ID: " + playlist.getId() );
        System.out.println("Pública? " + playlist.isPublica());
        System.out.println("Qtd Músicas: " + playlist.getQtdMusicas());
        System.out.println("Duração: " + playlist.getTotalDuracaoSeg() );
        System.out.println("Data Criação: " + playlist.getDataCriacao());

        // se quiser imprimir as músicas sem o FOR
        // playlist.getMusicas().get(0).getTitulo();
        // playlist.getMusicas().get(1).getTitulo();
        // playlist.getMusicas().get(2).getTitulo();

        // FOR tradicional
        System.out.println("LISTA de MUSICAS:");
        // for(int i = 0; i < playlist.getMusicas().size(); i++){
        //     System.out.println("ID: " + playlist.getMusicas().get(i).getId());
        //     System.out.println("Título: " + playlist.getMusicas().get(i).getTitulo());
        //     System.out.println("Autor: " + playlist.getMusicas().get(i).getAutor());
        // }
        
        // FOR EACH
        for(Musica musica : playlist.getMusicas()){
            System.out.println("ID: " + musica.getId());
            System.out.println("Título: " + musica.getTitulo());
            System.out.println("Autor: " + musica.getAutor());
        }

    }
}
