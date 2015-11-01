package entidad.dao;
import BaseDatos.Conexion;
import entidad.Medida;
import javax.swing.JOptionPane;
public class MedidaDao {
    public void registrarMedida(Medida me) throws Exception{
        System.out.println("Empieza operacion Registra Medida");
        Conexion.Conectar();
        String sql="INSERT INTO unidadmedida(medida,descripcion)"
                +"VALUES('"+me.getMedida()+"',"
                +"'"+me.getDescripcion()+"')";
        System.out.println("Intentando registrar entidad de tipo "+me.getClass().getName());
        try {
            Conexion.Ejecutar(sql);
            System.out.println("Medida Registrada");
        } catch (Exception e) {
            System.out.println("No se Puede Registrar Medida "+e.getMessage());
        }finally{
            try {
                Conexion.Desconectar();
            } catch (Exception e) {
                System.out.println("No se Pudo Desconectar BD "+e.getMessage());
            }
        }
        System.out.println("Finaliza operacion registrar");
    }
    public void eliminarMedida(String codigo) throws Exception{
        Conexion.Conectar();
        String sql="DELETE FROM unidadmedida WHERE idMedida='"+codigo+"'";
        Conexion.Ejecutar(sql);
        JOptionPane.showMessageDialog(null, "Registro Borrado");
        Conexion.Desconectar();
    }
}