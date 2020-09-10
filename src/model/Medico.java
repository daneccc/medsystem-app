package model;

public class Medico {
    Medico(){
        this.id = Medico.getNum_medicos();
        this.especialidade = "";
        this.nome = "";
        this.CRM = "";
    }
    
    private int id;
    private static int num_medicos = 0;
    private String especialidade;
    private String nome;
    private String CRM;

    public static int getNum_medicos() {
        return num_medicos;
    }

    public static void incNum_medicos() {
        Medico.num_medicos += 1;
    }
    
    public static void decNum_medicos() {
        Medico.num_medicos -= 1;
    }
    
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
