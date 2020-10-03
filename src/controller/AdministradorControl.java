package controller;
import java.util.ArrayList;
import java.util.Date;
import model.Administrador;

public class AdministradorControl {
    static ArrayList<Administrador> listaAdministradores = new ArrayList();
    
    static void CadastrarAdministrador(Administrador p){
        listaAdministradores.add(p);
    }
    
    static boolean AlterarAdministrador(int id, String nome, String cpf, String rg, String contato,
            Date nasc, String endereco, String sexo){
        for(Administrador m : listaAdministradores){
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

    static Administrador PesquisarAdministrador(String nome){
        for(Administrador a : listaAdministradores){
            if (a.getNome().equals(nome))
                return a;
        }
        return null;
    }
 
    static void DeletarAdministrador(Administrador a){
        listaAdministradores.remove(a);
    }
    
    static ArrayList<Administrador> ListarAdministradors(){
        return listaAdministradores;
    }
}
