package controller;
import java.util.ArrayList;
import model.Status;

public class StatusControl {
    static ArrayList<Status> listaStatus = new ArrayList();
    
    static void CadastrarStatus(Status p){
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
    }
    
    static ArrayList<Status> ListarStatuss(){
        return listaStatus;
    }
}
