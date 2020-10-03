package controller;
import java.util.ArrayList;
import java.util.Date;
import model.Atendente;

public class AtendenteControl {
    static ArrayList<Atendente> listaAtendentees = new ArrayList();
    
    public static void CadastrarAtendente(Atendente p){
        listaAtendentees.add(p);
    }
    
    public static boolean AlterarAtendente(int id, String nome, String cpf, String rg, String contato,
        Date nasc, String endereco, String sexo){
        for(Atendente m : listaAtendentees){
            if(m.getId() == id){
                m.setNome(nome);
                m.setCpf(cpf);
                m.setRg(rg);
                m.setContato(contato);
                m.setNasc(nasc);
                m.setEndereco(endereco);
                m.setSexo(sexo);
                return true;
            }
        }
        return false;
    }

    public static Atendente PesquisarAtendente(String nome){
        for(Atendente a : listaAtendentees){
            if (a.getNome().equals(nome))
                return a;
        }
        return null;
    }
 
    public static void DeletarAtendente(Atendente a){
        listaAtendentees.remove(a);
    }
    
    public static ArrayList<Atendente> ListarAtendentes(){
        return listaAtendentees;
    }
}
