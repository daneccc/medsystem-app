package controller;
import java.util.ArrayList;
import model.Agenda;
import model.Horario;

public class AgendaControl {
    static ArrayList<Agenda> listaAgendas = new ArrayList();
    
    static void CadastrarAgenda(Agenda p){
        listaAgendas.add(p);
    }

    static boolean AlterarAgenda(int id, int fkMedico, Horario deSegunda, Horario deTerca,
            Horario deQuarta, Horario deQuinta, Horario deSexta){
        for(Agenda a : listaAgendas){
            if(a.getId() == id){
                a.setFkMedico(fkMedico);
                a.setDeSegunda(deSegunda);
                a.setDeTerca(deTerca);
                a.setDeQuarta(deQuarta);
                a.setDeQuinta(deQuinta);
                a.setDeSexta(deSexta);
                return true;
            }
        }
        return false;
    }

    static Agenda PesquisarAgenda(int fkMedico){
        for(Agenda a : listaAgendas){
            if (a.getFkMedico() == fkMedico)
                return a;
        }
        return null;
    }
 
    static void DeletarAgenda(Agenda c){
        listaAgendas.remove(c);
    }
    
    static ArrayList<Agenda> ListarAgendas(){
        return listaAgendas;
    }
}
