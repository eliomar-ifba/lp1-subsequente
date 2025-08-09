package aula090808;

import java.util.UUID;

public class Endereco {
    private UUID id;
    private String rua;
    private String bairro;
    
    public Endereco(UUID id, String rua, String bairro) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
    }
    public Endereco() {
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
}
