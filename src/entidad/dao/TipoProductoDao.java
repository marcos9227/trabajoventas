package entidad.dao;
import BaseDatos.Conexion;
import entidad.TipoProducto;
import javax.swing.JOptionPane;
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
    public void eliminarTipoProd(String codigo) throws Exception{
        Conexion.Conectar();
        String sql="DELETE FROM tipoproducto WHERE idTipoProd='"+codigo+"'";
        Conexion.Ejecutar(sql);
        JOptionPane.showMessageDialog(null, "Registro Borrado");
        Conexion.Desconectar();
    }
}