package modelo.dao;
import BaseDatos.Conexion;
import entidad.*;
import javax.swing.JOptionPane;
public class ProveedorDao {
    int i;
    public void registrarProveedor(Proveedor p) throws Exception{
        System.out.println("Empieza Operacion Registar Proveedor");          
        try {
            Conexion.Conectar();
            String sql="INSERT INTO proveedor(ruc,razonsocial,direccion,telefono,email)"
                +"VALUES('"+p.getRuc()+"',"
                +"'"+p.getRazonsocial()+"',"
                +"'"+p.getDireccion()+"',"
                +"'"+p.getTelefono()+"',"
                +"'"+p.getEmail()+"')";
            System.out.println("Intentando registrar entidad de tipo "+p.getClass().getName());
            i= Conexion.Ejecutar(sql);
                if(i>0){
                    JOptionPane.showMessageDialog(null, "Proveedor registrado exitosamente");
                    System.out.println("Proveedor Registrado");
                }
        } catch (Exception e) {
            System.out.println("No se Puede Registrar Proveedor"+e.getMessage());
        }finally {
            Conexion.Desconectar();
        }
        System.out.println("Finaliza operación registrar");
    }
    public void eliminarProveedor(String cod) throws Exception{
        Conexion.Conectar();
        String sql="DELETE FROM proveedor WHERE idProveedor= '"+cod+"'";
        Conexion.Ejecutar(sql);
        JOptionPane.showMessageDialog(null, "Registro Borrado");
        Conexion.Desconectar();
    }
    public void modificarProveedor(Proveedor p,String id) throws Exception{
       try {
            Conexion.Conectar();
            String sql="UPDATE proveedor SET ruc= '"+p.getRuc()+"',razonsocial ='"+p.getRazonsocial()+"',direccion= '"+p.getDireccion()+"',telefono= '"+p.getTelefono()+"',email='"+p.getEmail()+"' WHERE idProveedor = '"+id+"'";
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
