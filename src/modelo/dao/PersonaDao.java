package modelo.dao;
import BaseDatos.Conexion;
import entidad.Persona;
import javax.swing.JOptionPane;
public class PersonaDao {
    int i;
   public void registrarCliente(Persona p) throws Exception{
        System.out.println("Empieza Operacion Registar Cliente");
            Conexion.Conectar();
            String sql="INSERT INTO datos(nombre,apellido,dni,email)"
                +"VALUES('"+p.getNombre()+"',"
                +"'"+p.getApellido()+"',"
                +"'"+p.getDni()+"',"
                +"'"+p.getEmail()+"')";
            System.out.println("Intentando registrar entidad de tipo "+p.getClass().getName());        
        try {
            i= Conexion.Ejecutar(sql);
            if(i>0){
                JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente");
                System.out.println("Cliente Registrado");
            }          
        } catch (Exception e) {
            System.out.println("No se Puede Registrar Cliente"+e.getMessage());
        }finally {
            try {
                Conexion.Desconectar();
            } catch (Exception e) {
            }
        }
        System.out.println("Finaliza operación registrar cliente");
    }
   public void eliminarCliente(String cod) throws Exception{
       Conexion.Conectar();
        String sql="DELETE FROM datos WHERE idDatos = '"+cod+"'";
        i=Conexion.Ejecutar(sql);
        if(i>0){
            JOptionPane.showMessageDialog(null, "Cliente Eliminado");
        }
        Conexion.Desconectar();
   }
}