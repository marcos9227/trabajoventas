package entidad.dao;
import BaseDatos.Conexion;
import entidad.Producto;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class ProductoDao {
    public void registrarProducto(Producto p) throws Exception{
        System.out.println("Empieza Operacion Registar Producto");
            Conexion.Conectar();
            String sql="INSERT INTO producto(nombreProd,precio,stock,contenido,idMedida,img,idTipoProd)"
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
    public void eliminarProdcuto(String cod) throws Exception{
        Conexion.Conectar();
        String sql="DELETE FROM producto WHERE idProducto = '"+cod+"'";
        Conexion.Ejecutar(sql);
        JOptionPane.showMessageDialog(null, "Registro Borrado");
        Conexion.Desconectar();
    }
        public void descontarStock(String cod,String can) throws Exception{
        Conexion.Conectar();
        int des = Integer.parseInt(can);
       String cap="";
       int desfinal;
       String sql="SELECT * FROM producto WHERE  idProducto='"+cod+"'";
        try {
            ResultSet rs= Conexion.Consultar(sql);
            while(rs.next()){
                cap= rs.getString(4);
            }
        } catch (Exception e) {
        }
        desfinal=Integer.parseInt(cap)-des;
        String modi="UPDATE producto SET stock='"+desfinal+"' WHERE idProducto = '"+cod+"'";
        try {
            Conexion.Ejecutar(modi);
        } catch (Exception e) {
        }
    }
}