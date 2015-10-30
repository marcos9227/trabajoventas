package entidad.dao;
import BaseDatos.Conexion;
import entidad.TipoProducto;
public class TipoProductoDao {
    public void registrarTipoProd(TipoProducto tp)throws Exception{
        System.out.println("Empieza operacion Registrar Tipo Producto");
        Conexion.Conectar();
         String sql="INSERT INTO tipoproducto(tipoProd,descripcion)"
                +"VALUES('"+tp.getTipoProd()+"',"
                +"'"+tp.getDescripcion()+"')";
        System.out.println("Intentando registrar entidad de tipo "+tp.getClass().getName());
        try {
            Conexion.Ejecutar(sql);
            System.out.println("Tipo Producto Registrado");
        } catch (Exception e) {
            System.out.println("No se Puede Registrar Tipo Producto "+e.getMessage());
        }finally{
            try {
                Conexion.Desconectar();
            } catch (Exception e) {
            }
        }
        System.out.println("Finaliza operacion Registrar Tipo Producto");
    } 
}