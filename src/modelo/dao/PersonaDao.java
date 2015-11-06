package modelo.dao;
import BaseDatos.Conexion;
import entidad.Persona;
import javax.swing.JOptionPane;
public class PersonaDao {
    int i;
   public void registrarCliente(Persona p) throws Exception{
        System.out.println("Empieza Operacion Registar Cliente");
        try {
            Conexion.Conectar();
                String sql="INSERT INTO datos(nombre,apellido,dni,email)"
                +"VALUES('"+p.getNombre()+"',"
                +"'"+p.getApellido()+"',"
                +"'"+p.getDni()+"',"
                +"'"+p.getEmail()+"')";
                System.out.println("Intentando registrar entidad de tipo "+p.getClass().getName());        

                i= Conexion.Ejecutar(sql);
                if(i>0){
                    JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente");
                    System.out.println("Cliente Registrado");
                }                    
        } catch (Exception e) {
            System.out.println("No se Puede Registrar Cliente"+e.getMessage());
        }finally {
            Conexion.Desconectar();
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
   public void modificarCliente(Persona p,String cod) throws Exception{
       try {
            Conexion.Conectar();
            String sql="UPDATE datos SET nombre = '"+p.getNombre()+"',apellido ='"+p.getApellido()+"',dni = '"+p.getDni()+"',email='"+p.getEmail()+"' WHERE idDatos = '"+cod+"'";
            i=Conexion.Ejecutar(sql);
            if(i>0){
               JOptionPane.showMessageDialog(null, "Actualizado"); 
            }     
        } catch (Exception e) {
            System.out.println("No se pudo actualizar cliente"+e.getMessage());
        }finally {
            Conexion.Desconectar();
        }
   }
}