package model;

public class Medico extends Usuario {
    Medico(){
        this.id = 0;
        this.nome = "";
        this.CRM = "";
    }
    
    private int id;
    private String nome;
    private String cpf, rg, nasc, contato;
    private String CRM;
    private String endereco;
    private int sexo; 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
