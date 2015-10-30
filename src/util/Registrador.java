package util;
import BaseDatos.Conexion;
import entidad.Medida;
import entidad.Persona;
import entidad.Producto;
public class Registrador {
    private int contador=0;
     public void registrarProducto(Producto p) throws Exception{
        System.out.println("Empieza Operacion Registar Producto");
            Conexion.Conectar();
            String sql="INSERT INTO producto(nombreProd,precio,contenido,stock,idMedida,img,idTipoProd)"
                +"VALUES('"+p.getNombreProd()+"',"
                +"'"+p.getPrecio()+"',"
                +"'"+p.getStock()+"',"
                +"'"+p.getContenido()+"',"
                +"'"+p.getIdMedida()+"',"
                +"'"+p.getImg()+"',"
                +"'"+p.getIdTipoProd()+"')";
            System.out.println("Intentando registrar entidad de tipo "+p.getClass().getName());
        try {
            Conexion.Ejecutar(sql);
            System.out.println("Producto Registrado");
        } catch (Exception e) {
            System.out.println("No se Puede Registrar Produtco"+e.getMessage());
        }finally {
            try {
                Conexion.Desconectar();
            } catch (Exception e) {
            }
        }
        System.out.println("Finaliza operación registrar");
    }
    public void registarMedida(Medida me) throws Exception{
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