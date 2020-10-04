package controller;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    
    public static void CadastrarConsulta(Consulta p){
        listaConsultas.add(p);
    }    
    
    public static boolean AlterarConsulta(int id, Paciente paciente, Medico medico, Date data,
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

    public static Consulta PesquisarConsulta(Date data){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Consulta c : listaConsultas){
            if (c.getData().contentEquals(df.format(data)))
                return c;
        }
        return null;
    }
 
    public static void DeletarConsulta(Consulta c){
        listaConsultas.remove(c);
    }
    
    public static ArrayList<Consulta> ListarConsultas(){
        return listaConsultas;
    }
}
