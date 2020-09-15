package model;

abstract public class Funcionario {
    
    private int id;
    private int numAtendente = 0;
    private String nome;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getNumAtendente() {
        return numAtendente;
    }

    public void setNumAtendente(int numAtendente) {
        this.numAtendente = numAtendente;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
