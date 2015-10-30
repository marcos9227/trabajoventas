package entidad.dao;
import BaseDatos.Conexion;
import entidad.Persona;
public class PersonaDao {
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
            Conexion.Ejecutar(sql);
            System.out.println("Cliente Registrado");
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
}