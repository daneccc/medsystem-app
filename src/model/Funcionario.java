package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



abstract public class Funcionario extends Usuario {
    
    private int id;
    private String nome, cpf, rg, contato, endereco, sexo;
    private Date nasc;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNasc() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(this.nasc);
    }

    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
       
}