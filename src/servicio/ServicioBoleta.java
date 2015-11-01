package servicio;

import entidad.Boleta;
import modelo.dao.BoletaDao;
import modelo.dao.BoletaDao;

public class ServicioBoleta {
    public void regBoleta(Boleta miboleta) throws Exception{
        BoletaDao bol= new BoletaDao();
        bol.registrarBoleta(miboleta);
    }

}
