package servicio;
import entidad.Producto;
import entidad.dao.ProductoDao;
public class ServicioProducto {
    public void registroPro(Producto miProducto) throws Exception{
        ProductoDao miProductoDao;
                miProductoDao = new ProductoDao();				
                miProductoDao.registrarProducto(miProducto);
    }
    public void eliminarPro(String cod)throws Exception{
        ProductoDao miProductoDao;
                miProductoDao = new ProductoDao();				
                miProductoDao.eliminarProdcuto(cod);
    }
    public void desStock(String cod, String can) throws Exception{
        ProductoDao miProductoDao= new ProductoDao();
            miProductoDao.descontarStock(cod, can);
    }
    public String obtener1(int nombre)throws Exception{
        ProductoDao miProductoDao;
                miProductoDao = new ProductoDao();				
                String nombre1=miProductoDao.obNOmbre1(nombre);
                return nombre1;
    }
    public String obtener2(int tipo)throws Exception{
        ProductoDao miProductoDao;
                miProductoDao = new ProductoDao();				
                String tprod=miProductoDao.obNOmbre2(tipo);
                return tprod;
    }
}