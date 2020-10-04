package controller;
import java.util.ArrayList;
import model.Paciente;

public class PacienteControl {
    static ArrayList<Paciente> listaPacientes = new ArrayList();
    static int id;
    
    public static void CadastrarPaciente(Paciente p){
        id++;
        p.setId(id);
        listaPacientes.add(p);
    }
    
    public static boolean AlterarPaciente(int id, String nome, String sexo, String data_nasc,
            String CPF, String endereco, String telefone){
        for(Paciente p1 : listaPacientes){
            if(p1.getId() == id){
                p1.setNome(nome);
                p1.setSexo(sexo);
                p1.setData_nasc(data_nasc);
                p1.setCPF(CPF);
                p1.setEndereco(endereco);
                p1.setTelefone(telefone);
                return true;
            }
        }
        return false;
    }

    public static Paciente PesquisarPaciente(String cpf){
        for(Paciente p : listaPacientes){
            if (p.getCPF().equals(cpf))
                return p;
        }
        return null;
    }
    
    public static Paciente PesquisarPacienteNome(String nome){
        for(Paciente p : listaPacientes){
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }
 
    public static void DeletarPaciente(Paciente p){
        listaPacientes.remove(p);
        id--;
    }
    
    public static ArrayList<Paciente> ListarPacientes(){
        return listaPacientes;
    }
}
