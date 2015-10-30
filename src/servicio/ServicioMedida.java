package servicio;
import entidad.Medida;
import entidad.dao.MedidaDao;
public class ServicioMedida {
    public void registroMed(Medida miMedida) throws Exception{
        MedidaDao miMedidaDao;
                miMedidaDao = new MedidaDao();				
                miMedidaDao.registrarMedida(miMedida);
    }
}