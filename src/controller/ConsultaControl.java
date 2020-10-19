package controller;
import java.util.ArrayList;
import model.Atendente;
import model.Consulta;
import model.Medico;
import model.Paciente;
import model.Status;
import model.TipoAtendimento;

public class ConsultaControl {
    static ArrayList<Consulta> listaConsultas = new ArrayList();
    
    public static void CadastrarConsulta(Consulta p){
        listaConsultas.add(p);
    }    
    
    public static boolean AlterarConsulta(int id, Paciente paciente, Medico medico, String data,
            String hora, Atendente atendente, Status status, TipoAtendimento tipoAtendimento){
        for(Consulta c : listaConsultas){
            if(c.getId() == id){
                c.setPaciente(paciente);
                c.setAtendente(atendente);
                c.setMedico(medico);
                c.setData(data);
                c.setHora(hora);
                c.setStatus(status);
                c.setTipoAtendimento(tipoAtendimento);
                return true;
            }
        }
        return false;
    }

    public static Consulta PesquisarConsulta(String data){
        for(Consulta c : listaConsultas){
            if (c.getData().contentEquals(data))
                return c;
        }
        return null;
    }

    public static Consulta PesquisarConsulta(int id){
        for(Consulta c : listaConsultas){
            if (c.getId() == id)
                return c;
        }
        return null;
    }
    
    public static boolean ConsultaExiste(int id){
        for(Consulta c : listaConsultas){
            if (c.getId() == id)
                return true;
        }
        return false;
    }
 
    public static void DeletarConsulta(Consulta c){
        listaConsultas.remove(c);
    }
    
    public static ArrayList<Consulta> ListarConsultas(){
        return listaConsultas;
    }
    
    public static ArrayList<Consulta> ListarConsultas(Medico m){
        ArrayList<Consulta> consultaArray = new ArrayList();
        for(Consulta c: listaConsultas){
            if(c.getMedico() == m){
                consultaArray.add(c);
            }
        }
        
        return consultaArray;
    }

    public static ArrayList<Consulta> ListarConsultas(Paciente p){
        ArrayList<Consulta> consultaArray = new ArrayList();
        for(Consulta c: listaConsultas){
            if(c.getPaciente() == p){
                consultaArray.add(c);
            }
        }
        
        return consultaArray;
    }

    public static ArrayList<Consulta> ListarConsultas(String data){
        ArrayList<Consulta> consultaArray = new ArrayList();
        for(Consulta c: listaConsultas){
            if(c.getData().equals(data)){
                consultaArray.add(c);
            }
        }
        
        return consultaArray;
    }
    
    public static int RetornaIdNovo(){
        int id = 0;
        for(Consulta c: listaConsultas){
            if(c.getId() > id)
                id = c.getId();
        }
        
        return id + 1;
    }
}
