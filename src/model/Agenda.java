package model;

public class Agenda {
    private int id;
    private int fkMedico;
    private Horario deSegunda;
    private Horario deTerca;
    private Horario deQuarta;
    private Horario deQuinta;
    private Horario deSexta;

    public Horario getDeSegunda() {
        return deSegunda;
    }

    public void setDeSegunda(Horario deSegunda) {
        this.deSegunda = deSegunda;
    }

    public Horario getDeTerca() {
        return deTerca;
    }

    public void setDeTerca(Horario deTerca) {
        this.deTerca = deTerca;
    }

    public Horario getDeQuarta() {
        return deQuarta;
    }

    public void setDeQuarta(Horario deQuarta) {
        this.deQuarta = deQuarta;
    }

    public Horario getDeQuinta() {
        return deQuinta;
    }

    public void setDeQuinta(Horario deQuinta) {
        this.deQuinta = deQuinta;
    }

    public Horario getDeSexta() {
        return deSexta;
    }

    public void setDeSexta(Horario deSexta) {
        this.deSexta = deSexta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFkMedico() {
        return fkMedico;
    }

    public void setFkMedico(int fkMedico) {
        this.fkMedico = fkMedico;
    }
    
    
}
