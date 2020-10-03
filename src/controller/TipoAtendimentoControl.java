package controller;
import java.util.ArrayList;
import model.TipoAtendimento;

public class TipoAtendimentoControl {
    static ArrayList<TipoAtendimento> listaTipoAtendimentos = new ArrayList();
    
    static void CadastrarTipoAtendimento(TipoAtendimento p){
        listaTipoAtendimentos.add(p);
    }
    
    static boolean AlterarTipoAtendimento(int id, String tipoAtendimento){
        for(TipoAtendimento ta : listaTipoAtendimentos){
            if(ta.getId() == id){
                ta.setTipoAtendimento(tipoAtendimento);
                return true;
            }
        }
        return false;
    }

    static TipoAtendimento PesquisarTipoAtendimento(int id){
        for(TipoAtendimento ta : listaTipoAtendimentos){
            if (ta.getId() == id)
                return ta;
        }
        return null;
    }
 
    static void DeletarTipoAtendimento(TipoAtendimento ta){
        listaTipoAtendimentos.remove(ta);
    }
    
    static ArrayList<TipoAtendimento> ListarTipoAtendimentos(){
        return listaTipoAtendimentos;
    }
}
