package model;

abstract public class Usuario {
    Usuario() {
        this.id = 0;
        this.username = "";
        this.password = "";
    }
    
    private int id;
    private int numUsuario = 0;
    private String username;
    private String password;

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
