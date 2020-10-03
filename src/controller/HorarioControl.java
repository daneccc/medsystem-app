package controller;
import java.util.ArrayList;
import model.Horario;

public class HorarioControl {
    static ArrayList<Horario> listaHorarios = new ArrayList();
    
    static void CadastrarHorario(Horario p){
        listaHorarios.add(p);
    }
    
    static boolean AlterarHorario(int id, String nomeHorario){
        for(Horario h : listaHorarios){
            if(h.getId() == id){
                h.setNomeHorario(nomeHorario);
                return true;
            }
        }
        return false;
    }

    static Horario PesquisarHorario(int id){
        for(Horario h : listaHorarios){
            if (h.getId() == id)
                return h;
        }
        return null;
    }
 
    static void DeletarHorario(Horario h){
        listaHorarios.remove(h);
    }
    
    static ArrayList<Horario> ListarHorarios(){
        return listaHorarios;
    }
}
