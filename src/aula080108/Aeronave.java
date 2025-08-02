package aula080108;

import java.util.UUID;

public class Aeronave {
    private UUID id;
    private String modelo;
    private String codigo;
    private Piloto piloto;
    private Piloto copiloto;

    public Aeronave(UUID id, String modelo, String codigo, Piloto piloto, Piloto copiloto) {
        this.id = id;
        this.modelo = modelo;
        this.codigo = codigo;
        this.piloto = piloto;
        this.copiloto = copiloto;
    }
    public Aeronave() {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Piloto getPiloto() {
        return piloto;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    public Piloto getCopiloto() {
        return copiloto;
    }
    public void setCopiloto(Piloto copiloto) {
        this.copiloto = copiloto;
    }

    

}
