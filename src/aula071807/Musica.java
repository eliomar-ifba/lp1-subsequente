package aula071807;

import java.util.UUID;

public class Musica {
    //Tipos de encapsulamento (proteção)
        // default (sem nada) = acesso livre apenas no mesmo pacote
        // public = acesso livre geral
        // private = acesso restrito geral
        // protected = acesso restrito geral, mas livre para classes filhas
    private UUID id;
    private String titulo;
    private String autor;

    //métodos acessores 
    //tem o papel de manipular os atributos
    public void setId(UUID id){
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    

    

}
