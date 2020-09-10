package model;


abstract public class Atendente {
    Atendente() {
        this.id = Atendente.getNumAtendente();
        this.nome = "";
    }
    
    private int id;
    private static int numAtendente = 0;
    private String nome;

    public static int getNumAtendente() {
        return numAtendente;
    }

    public static void incNumAtendente() {
        Atendente.numAtendente += 1;
    }
    
    public static void decNumAtendente() {
        Atendente.numAtendente -= 1;
    }
    
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
}
