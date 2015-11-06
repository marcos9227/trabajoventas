package modelo.dao;
import BaseDatos.Conexion;
import entidad.Boleta;
import javax.swing.JOptionPane;
public class BoletaDao {
    int i;
    public void registrarBoleta(Boleta b) throws Exception{
        System.out.println("Empieza Operacion Registar Boleta");
            Conexion.Conectar();
            String sql="INSERT INTO boleta(idBoleta,fecha,hora,idUsuario,idDatos,precioTotal)"
                +"VALUES('"+b.getId()+"',"
                +"'"+b.getFecha()+"',"
                +"'"+b.getHora()+"',"
                +"'"+b.getIdUser()+"',"
                +"'"+b.getIdCliente()+"',"
                +"'"+b.getTotal()+"')";
            System.out.println("Intentando registrar entidad de tipo "+b.getClass().getName());
        try {
            i=Conexion.Ejecutar(sql);
            if(i>0){
                System.out.println("Boleta registrada");
                JOptionPane.showMessageDialog(null, "Venta Realizada");
            }           
        } catch (Exception e) {
            System.out.println("No se pudo registrar boleta"+e.getMessage());
        }finally {
            try {
                Conexion.Desconectar();
            } catch (Exception e){
            }
        }
        System.out.println("Finaliza operación registrar");
    }
}
