package util;
import entidad.*;
import javax.swing.JOptionPane;
public class Validador {  
    public void validarStock(Producto p) throws Exception{
        if(p.getStock() < 0){
            throw new Exception("El Stock debe ser Negativo");
        }
    }
    public void validarDni(Persona per) throws Exception{
        String dig= Integer.toString(per.getDni());
        if(per.getDni()<0){
            JOptionPane.showMessageDialog(null, "El dni es negativo","Advertencia",JOptionPane.ERROR_MESSAGE);
            throw new Exception("El Dni es Negativo");
        }else if(dig.length()!=8){
            JOptionPane.showMessageDialog(null, "El dni debe tener 8 digitos","Advertencia",JOptionPane.ERROR_MESSAGE);
            throw new Exception("El Dni no tiene 8 digitos");
        }
    }
    public void validarEmail(Persona p) throws Exception{
        if(!p.getEmail().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            JOptionPane.showMessageDialog(null, "Email incorreto","Advertencia",JOptionPane.ERROR_MESSAGE);
            throw new Exception("Email incorrecto");
        }
    }
    public void validarLetras(Persona p)throws Exception{
        if(!p.getNombre().matches("^[A-Za-z ]*")||!p.getApellido().matches("^[A-Za-z ]*")){
            JOptionPane.showMessageDialog(null, "Ingrese solo letras ","Advertencia",JOptionPane.ERROR_MESSAGE);
            throw new Exception("Ingresar solo letras");
        }
    }
    public void campoVacio(Persona p) throws Exception{
        if(p.getNombre().length()==0||p.getApellido().length()==0){
            JOptionPane.showMessageDialog(null, "Existen campos vacios","Advertencia",JOptionPane.ERROR_MESSAGE);
            throw new Exception("Campos vacios");
        }
    }
}