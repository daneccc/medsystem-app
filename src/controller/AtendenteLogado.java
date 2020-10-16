/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Atendente;

/**
 *
 * @author leonardo
 */
public class AtendenteLogado {
    static ArrayList<Atendente> listaAtendentes = new ArrayList();
    
    public static void LogarAtendente(Atendente p){
        listaAtendentes.add(p);
    }
    
    public static Atendente PesquisarAtendente(String cpf){
        for(Atendente p : listaAtendentes){
            if (p.getCpf().equals(cpf))
                return p;
        }
        return null;
    }
    
    public static boolean EstaLogado(String cpf) {
        Atendente p = PesquisarAtendente(cpf);
        if(p != null) {
            return true;
        }
        return false;
    }
    
    public static void Deslogar() {
        listaAtendentes.remove(0);
    }
}
