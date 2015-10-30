package servicio;
import entidad.Persona;
import entidad.dao.PersonaDao;
public class ServicioPersona {
    public void registroPer(Persona miPersona) throws Exception{
        PersonaDao miPersonaDao;
                miPersonaDao = new PersonaDao();				
                miPersonaDao.registrarCliente(miPersona);
    }
}