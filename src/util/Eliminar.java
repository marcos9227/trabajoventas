package util;
import BaseDatos.Conexion;
import javax.swing.JOptionPane;
public class Eliminar {
    public void eliminarProdcuto(String cod) throws Exception{
        Conexion.Conectar();
        String sql="DELETE FROM producto WHERE idProducto = '"+cod+"'";
        Conexion.Ejecutar(sql);
        JOptionPane.showMessageDialog(null, "Borrado");
        Conexion.Desconectar();
    }  
}