package aula090808;

import java.time.LocalDateTime;
import java.util.UUID;

public class Partida {
    private UUID id;
    private LocalDateTime data;
    private Time timeMandante;
    private Time timeVisitante;
    private Estadio estadio;
    
    public Partida() {
    }
    public Partida(UUID id, LocalDateTime data, Time timeMandante, Time timeVisitante, Estadio estadio) {
        this.id = id;
        this.data = data;
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
        this.estadio = estadio;
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public Time getTimeMandante() {
        return timeMandante;
    }
    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }
    public Time getTimeVisitante() {
        return timeVisitante;
    }
    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }
    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

}
