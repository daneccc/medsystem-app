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
    static int id=0;
    
    public static void CadastrarConsulta(Consulta p){
        id++;
        p.setId(id);
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
 
    public static void DeletarConsulta(Consulta c){
        listaConsultas.remove(c);
        id--;
    }
    
    public static ArrayList<Consulta> ListarConsultas(){
        return listaConsultas;
    }
}
