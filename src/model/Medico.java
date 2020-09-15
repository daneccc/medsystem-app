package model;

public class Medico extends Usuario {
    Medico(){
        this.id = 0;
        this.especialidade = "";
        this.nome = "";
        this.CRM = "";
    }
    
    private int id;
    private int num_medicos = 0;
    private String especialidade;
    private String nome;
    private String CRM;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
}
