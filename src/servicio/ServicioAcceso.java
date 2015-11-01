package servicio;
import BaseDatos.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import vista.Login;
import vista.MenuPrincipal;
import vista.MenuVendedor;
public class ServicioAcceso {  
    public void acceso(String usuario,String contra,int tipo) throws Exception{
       int resultado=0;
        try {
            Conexion.Conectar();
            System.out.println("Empieza verificacion");
            String sql="SELECT * FROM usuario WHERE usu='"+usuario+"' and password='"+contra+"' and idTipoUsuario='"+tipo+"'";
            ResultSet rs=Conexion.Consultar(sql);
            String usua="";
            int tip=0;
            if(rs.next()){
                resultado=1;
                usua=rs.getString(2);
                tip=Integer.parseInt(rs.getString(4));   
            }
            if (resultado==1) {
                MenuPrincipal p=new MenuPrincipal();
                MenuVendedor pr=new MenuVendedor();
                if (tip==1) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador\n Has ingresado "
                    + "satisfactoriamente al sistema", "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE);
                    p.recibe.setText(usua);
                    p.show();   
                }else{
                    JOptionPane.showMessageDialog(null, "Bienvenido Vendedor\n Has ingresado "
                    + "satisfactoriamente al sistema", "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE);
                    pr.recibe1.setText(usua);
                    pr.show();  
                }
            }else{
                Login lo=new Login();
                JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Por favor ingrese un usuario, contraseña y/o Tipo Usuario correctos", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
                lo.show();
            }
            System.out.println("Finaliza Operacion");
            Conexion.Desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}