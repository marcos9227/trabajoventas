package util;
import BaseDatos.Conexion;
import javax.swing.JOptionPane;
public class Eliminar {
    public void eliminarProdcuto(String cod) throws Exception{
        Conexion.Conectar();
        String sql="DELETE FROM producto WHERE idProducto = '"+cod+"'";
        Conexion.Ejecutar(sql);
        JOptionPane.showMessageDialog(null, "Registro Borrado");
        Conexion.Desconectar();
    } 
    public void eliminarMedida(String codigo) throws Exception{
        Conexion.Conectar();
        String sql="DELETE FROM unidadmedida WHERE idMedida='"+codigo+"'";
        Conexion.Ejecutar(sql);
        JOptionPane.showMessageDialog(null, "Registro Borrado");
        Conexion.Desconectar();
    }
}