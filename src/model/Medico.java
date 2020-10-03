package model;

public class Medico extends Funcionario {
    public Medico(){
        super();
    }

    private String CRM;
    private Agenda agendaDeTrabalho;

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public Agenda getAgendaDeTrabalho() {
        return agendaDeTrabalho;
    }

    public void setAgendaDeTrabalho(Agenda agendaDeTrabalho) {
        this.agendaDeTrabalho = agendaDeTrabalho;
    }
}
