package controller;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import model.Atendente;
import model.Consulta;
import model.Medico;
import model.Paciente;
import model.Status;
import model.TipoAtendimento;

public class ConsultaControl {
    static ArrayList<Consulta> listaConsultas = new ArrayList();
    
    static void CadastrarConsulta(Consulta p){
        listaConsultas.add(p);
    }    
    
    static boolean AlterarConsulta(int id, Paciente paciente, Medico medico, Date data,
            Time hora, Atendente atendente, Status status, TipoAtendimento tipoAtendimento){
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

    static Consulta PesquisarConsulta(Date data){
        for(Consulta c : listaConsultas){
            if (c.getData() == data)
                return c;
        }
        return null;
    }
 
    static void DeletarConsulta(Consulta c){
        listaConsultas.remove(c);
    }
    
    static ArrayList<Consulta> ListarConsultas(){
        return listaConsultas;
    }
}
