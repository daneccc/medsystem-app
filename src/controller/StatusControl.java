package controller;
import java.util.ArrayList;
import model.Status;

public class StatusControl {
    static ArrayList<Status> listaStatus = new ArrayList();
    static int id=0;
    
    public static void CadastrarStatus(Status p){
        id++;
        p.setId(id);
        listaStatus.add(p);
    }
    
    public static boolean AlterarStatus(int id, String nome){
        for(Status s : listaStatus){
            if(s.getId() == id){
                s.setNome(nome);
                return true;
            }
        }
        return false;
    }

    public static Status PesquisarStatus(int id){
        for(Status s : listaStatus){
            if (s.getId() == id)
                return s;
        }
        return null;
    }
 
    public static void DeletarStatus(Status s){
        listaStatus.remove(s);
        id--;
    }
    
    public static ArrayList<Status> ListarStatuss(){
        return listaStatus;
    }
}
