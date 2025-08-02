package aula080108;

import java.util.UUID;

public class Passageiro {
    private UUID id;
    private String nome;
    private String cpf;
    private Endereco endResidencial;

    public Passageiro() {
    }
    public Passageiro(UUID id, String nome, String cpf, Endereco endResidencial) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endResidencial = endResidencial;
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndResidencial() {
        return endResidencial;
    }
    public void setEndResidencial(Endereco endResidencial) {
        this.endResidencial = endResidencial;
    }

    
    
}
