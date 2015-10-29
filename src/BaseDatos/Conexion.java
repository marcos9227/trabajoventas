package BaseDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Conexion {
    static Connection con;
    public static void Conectar() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/baseproyecto", "root", "");
        } catch (Exception e) {
            throw new Exception("Imposible realizar conexion con la BD"+e.getMessage());            
        }
    }
    public static ResultSet Consultar(String sql) throws Exception{
        try{
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);
            return resultado;
        }
        catch (Exception e) {
            throw new Exception("Error al consultar la BD"+e.getMessage());            
        }
    } 
    public static int Ejecutar(String sql) throws Exception{
        try{
            Statement st = con.createStatement();
            int resultado = st.executeUpdate(sql);
            return resultado;
        }
        catch (Exception e) {
            throw new Exception("Error al actualizar la BD"+e.getMessage());            
        }
    }
    public static void Desconectar() throws Exception{
        try{
            con.close();
        }
        catch(Exception e){
            throw new Exception("Error al desconectar con la BD"+e.getMessage());
        }
    }
}