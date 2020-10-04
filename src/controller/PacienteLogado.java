/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import model.Paciente;

/**
 *
 * @author leonardo
 */
public class PacienteLogado {
    static ArrayList<Paciente> listaPacientes = new ArrayList();
    
    public static void LogarPaciente(Paciente p){
        listaPacientes.add(p);
    }
    
    public static Paciente PesquisarPaciente(String cpf){
        for(Paciente p : listaPacientes){
            if (p.getCPF().equals(cpf))
                return p;
        }
        return null;
    }
    
    public static boolean EstaLogado(String cpf) {
        Paciente p = PesquisarPaciente(cpf);
        if(p != null) {
            return true;
        }
        return false;
    }
}


