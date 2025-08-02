package aula071807;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Playlist {
    private UUID id;
    private String nome;
    private LocalDateTime dataCriacao;
    private boolean publica;
    private int qtdMusicas;
    private int totalDuracaoSeg;
    private List<Musica> musicas;

    public List<Musica> getMusicas(){
        return this.musicas;
    }

    public LocalDateTime getDataCriacao(){
        return this.dataCriacao;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public void setPublica(boolean publica) {
        this.publica = publica;
    }
    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }
    public void setTotalDuracaoSeg(int totalDuracaoSeg) {
        this.totalDuracaoSeg = totalDuracaoSeg;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isPublica() {
        return publica;
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public int getTotalDuracaoSeg() {
        return totalDuracaoSeg;
    }

    

}
