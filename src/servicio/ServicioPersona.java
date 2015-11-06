package servicio;
import entidad.Persona;
import modelo.dao.PersonaDao;
public class ServicioPersona {
    PersonaDao miPersonaDao = new PersonaDao();
    public void registroPer(Persona miPersona) throws Exception{				
        miPersonaDao.registrarCliente(miPersona);
    }
    public void eliminarPer(String cod) throws Exception{
        miPersonaDao.eliminarCliente(cod);
    }
    public void modificarPer(Persona p,String cod) throws Exception{
        miPersonaDao.modificarCliente(p, cod);
    }
}