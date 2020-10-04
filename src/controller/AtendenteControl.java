package controller;
import java.util.ArrayList;
import model.Atendente;

public class AtendenteControl {
    static ArrayList<Atendente> listaAtendentees = new ArrayList();
    static int id=0;
    
    public static void CadastrarAtendente(Atendente p){
        id++;
        p.setId(id);
        listaAtendentees.add(p);
    }
    
    public static boolean AlterarAtendente(int id, String nome, String cpf, String rg, String contato,
        String nasc, String endereco, String sexo){
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

    public static Atendente PesquisarAtendente(String cpf){
        for(Atendente a : listaAtendentees){
            if (a.getCpf().equals(cpf))
                return a;
        }
        return null;
    }
    
    public static void DeletarAtendente(Atendente a){
        listaAtendentees.remove(a);
        id++;
    }
    
    public static ArrayList<Atendente> ListarAtendentes(){
        return listaAtendentees;
    }
}
