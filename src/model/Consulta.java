package model;

import java.time.LocalDate;

public class Consulta {
    private Paciente paciente;

    private Dentista dentista;

    private LocalDate data_hora;

    public Consulta(Paciente paciente, Dentista dentista, LocalDate data_hora) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.data_hora = data_hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public LocalDate getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDate data_hora) {
        this.data_hora = data_hora;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "paciente=" + paciente +
                ", dentista=" + dentista +
                ", data_hora=" + data_hora +
                '}';
    }
}
