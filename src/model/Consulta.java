package model;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta {  
    private int id;
    private int numConsulta;
    private Paciente paciente;
    private Medico medico;
    private Date data;
    private Time hora;
    private Atendente atendente;
    private Status status;
    private TipoAtendimento tipoAtendimento; //retorno ou consulta
    
    
    public int getNumConsulta() {
        return numConsulta;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getData() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(this.data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getHora() {
        String hora[] = this.hora.toString().split(":", 2);
        return hora[0];
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

}
