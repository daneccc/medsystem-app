package controller;
import java.util.ArrayList;
import model.TipoAtendimento;

public class TipoAtendimentoControl {
    static ArrayList<TipoAtendimento> listaTipoAtendimentos = new ArrayList();
    static int id=0;
    
    public static void CadastrarTipoAtendimento(TipoAtendimento p){
        id++;
        p.setId(id);
        listaTipoAtendimentos.add(p);
    }
    
    public static boolean AlterarTipoAtendimento(int id, String tipoAtendimento){
        for(TipoAtendimento ta : listaTipoAtendimentos){
            if(ta.getId() == id){
                ta.setTipoAtendimento(tipoAtendimento);
                return true;
            }
        }
        return false;
    }

    public static TipoAtendimento PesquisarTipoAtendimento(int id){
        for(TipoAtendimento ta : listaTipoAtendimentos){
            if (ta.getId() == id)
                return ta;
        }
        return null;
    }
 
    public static void DeletarTipoAtendimento(TipoAtendimento ta){
        listaTipoAtendimentos.remove(ta);
        id--;
    }
    
    public static ArrayList<TipoAtendimento> ListarTipoAtendimentos(){
        return listaTipoAtendimentos;
    }
}
