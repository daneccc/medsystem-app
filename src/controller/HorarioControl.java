package controller;
import java.util.ArrayList;
import model.Horario;

public class HorarioControl {
    static ArrayList<Horario> listaHorarios = new ArrayList();
    static int id=0;
    
    public static void CadastrarHorario(Horario p){
        id++;
        p.setId(id);
        listaHorarios.add(p);
    }
    
    public static boolean AlterarHorario(int id, String nomeHorario){
        for(Horario h : listaHorarios){
            if(h.getId() == id){
                h.setNomeHorario(nomeHorario);
                return true;
            }
        }
        return false;
    }

    public static Horario PesquisarHorario(int id){
        for(Horario h : listaHorarios){
            if (h.getId() == id)
                return h;
        }
        return null;
    }
 
    public static void DeletarHorario(Horario h){
        listaHorarios.remove(h);
        id--;
    }
    
    public static ArrayList<Horario> ListarHorarios(){
        return listaHorarios;
    }
}
