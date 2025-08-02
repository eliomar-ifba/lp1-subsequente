package aula080108;

import java.util.List;
import java.util.UUID;

public class Voo {
    private UUID id;
    private String numero;
    private String destino;
    private String origem;
    private Aeronave aeronave;
    private List<Passageiro> passageiros;
    
    public Voo(UUID id, String numero, String destino, String origem, Aeronave aeronave, List<Passageiro> passageiros) {
        this.id = id;
        this.numero = numero;
        this.destino = destino;
        this.origem = origem;
        this.aeronave = aeronave;
        this.passageiros = passageiros;
    }
    public Voo() {
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public Aeronave getAeronave() {
        return aeronave;
    }
    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
    public List<Passageiro> getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
    
    

}
