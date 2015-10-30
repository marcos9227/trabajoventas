package servicio;
import entidad.TipoProducto;
import entidad.dao.TipoProductoDao;
public class ServicioTipoProducto {
    public void registroTipoProd(TipoProducto miTipoProducto) throws Exception{
        TipoProductoDao miTipoProductoDao;
                miTipoProductoDao = new TipoProductoDao();				
                miTipoProductoDao.registrarTipoProd(miTipoProducto);
    }
}