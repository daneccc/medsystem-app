package model;
import java.util.Date;

public class Consulta {
    Consulta(){
        this.paciente = new Paciente();
        this.medico = new Medico();
        this.data = null;
    }
    
    private int id;
    private static int numConsulta;
    private Paciente paciente;
    private Medico medico;
    private Date data;

    public static int getNumConsulta() {
        return numConsulta;
    }

    public static void incNumConsulta() {
        Consulta.numConsulta += 1;
    }    

    public static void decNumConsulta() {
        Consulta.numConsulta -= 1;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
