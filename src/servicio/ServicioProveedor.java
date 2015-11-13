package servicio;
import modelo.dao.ProveedorDao;
import entidad.Proveedor;
public class ServicioProveedor {
        ProveedorDao pv= new ProveedorDao();
    public void registroProv(Proveedor proveedor) throws Exception{				
        pv.registrarProveedor(proveedor);
    }
    public void eliminaProv(String id) throws Exception{				
        pv.eliminarProveedor(id);
    }
    public void modificaProv(Proveedor p,String c) throws Exception{
        pv.modificarProveedor(p, c);
    }
}
