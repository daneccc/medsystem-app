/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author leonardo
 */
public class UsuarioControl {
    static ArrayList<Usuario> listaUsuarios = new ArrayList();
    
    public static void CadastrarUsuario(Usuario u) {
        listaUsuarios.add(u);
    }
    
    public static boolean EstaCadastrado(String user, String pass) {
        Usuario u = PesquisaUsuario(user, pass);
        if(u != null) {
            return true;
        }
        return false;
    }
    
    public static Usuario PesquisaUsuario(String user, String pass) {
        for(Usuario p : listaUsuarios){
            if (p.getUsername().equals(user) && p.getPassword().equals(pass)) {
                return p;
            }
        }
        return null;
    }
}
