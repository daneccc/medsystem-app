/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Medico;

/**
 *
 * @author leonardo
 */
public class MedicoLogado {
    static ArrayList<Medico> listaMedicos = new ArrayList();
    
    public static void LogarMedico(Medico p){
        listaMedicos.add(p);
    }
    
    public static Medico PesquisarMedico(String cpf){
        for(Medico p : listaMedicos){
            if (p.getCpf().equals(cpf))
                return p;
        }
        return null;
    }
    
    public static boolean EstaLogado(String cpf) {
        Medico p = PesquisarMedico(cpf);
        if(p != null) {
            return true;
        }
        return false;
    }
}
