package controller;
import java.util.ArrayList;
import model.Status;

public class StatusControl {
    static ArrayList<Status> listaStatus = new ArrayList();
    static int id=0;
    
    static void CadastrarStatus(Status p){
        id++;
        p.setId(id);
        listaStatus.add(p);
    }
    
    static boolean AlterarStatus(int id, String nome){
        for(Status s : listaStatus){
            if(s.getId() == id){
                s.setNome(nome);
                return true;
            }
        }
        return false;
    }

    static Status PesquisarStatus(int id){
        for(Status s : listaStatus){
            if (s.getId() == id)
                return s;
        }
        return null;
    }
 
    static void DeletarStatus(Status s){
        listaStatus.remove(s);
        id++;
    }
    
    static ArrayList<Status> ListarStatuss(){
        return listaStatus;
    }
}
