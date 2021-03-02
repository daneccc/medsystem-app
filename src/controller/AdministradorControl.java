package controller;
import java.util.ArrayList;
import model.Administrador;





public class AdmControl {
    static ArrayList<Administrador> listaAdministradores = new ArrayList();
    
    static int id=0;
    
    //cadastra adm
    static void CadastrarAdm(Administrador p){
        id++;
        p.setId(id);
        listaAdministradores.add(p);
    }
    

    //altera adm
    static boolean AlterarAdm(int id, String nome, String cpf, String rg, String contato,
            String nasc, String endereco, String sexo){
        
        
        
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

    //pesquisa adm
    static Administrador PesquisarAdm(String nome){
        for(Administrador a : listaAdministradores){
            if (a.getNome().equals(nome))
                return a;
        }
        return null;
    }
 
    //deleta um administrador
    static void DeletarAdm(Administrador a){
        listaAdministradores.remove(a);
        id--;
    }
  
    


    static ArrayList<Administrador> ListarAdm(){
        return listaAdministradores;
    }
}
