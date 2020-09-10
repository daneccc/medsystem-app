package model;

import java.util.Calendar;


public class Paciente {
    Paciente(){
        this.id = Paciente.getNumPacientes();
        this.nome = "";
        this.data_nasc = null;
        this.CPF = "";
        this.endereco = "";
        this.telefone = "";
    }
    
    private static int num_pacientes = 0;
    private int id;
    private String nome;
    private Calendar data_nasc;
    private String CPF;
    private String endereco;
    private String telefone;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static int getNumPacientes() {
        return Paciente.num_pacientes;
    }

    public static void incNumPacientes() {
        Paciente.num_pacientes += 1;
    }

    public static void decNumPacientes() {
        Paciente.num_pacientes -= 1;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Calendar data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
