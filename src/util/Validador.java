package util;
import entidad.*;
import javax.swing.JOptionPane;
public class Validador {  
    public void validarStock(Producto p) throws Exception{
        if(p.getStock() < 0){
            throw new Exception("El Stock debe ser Negativo");
        }
    }
    public void validarCliente(Persona per) throws Exception{
        String dig= Integer.toString(per.getDni());
        if(dig.length()!=8){
            throw new Exception("El Dni no tiene 8 digitos");
        }else if(!per.getEmail().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new Exception("Email incorrecto");
        }else if(per.getNombre().length()==0||per.getApellido().length()==0){
            throw new Exception("Campos vacios");
        }
    }
    public void validarLetras(String c)throws Exception{
        if(!c.matches("^[A-Za-z ]*")){
            JOptionPane.showMessageDialog(null, "Ingrese solo letras ","Advertencia",JOptionPane.ERROR_MESSAGE);
            throw new Exception("Ingresar solo letras");
        }
    }
    public void validarNumeros(String n) throws Exception{
        long numero= Long.parseLong(n);
        if(numero<0){
            throw new Exception("Número negativo");
        }
    }
    public void validarProveedor(Proveedor prv) throws Exception{
        if(prv.getRuc().length()==0||prv.getRazonsocial().length()==0||prv.getDireccion().length()==0|| prv.getTelefono().length()==0|| prv.getEmail().length()==0){
            throw new Exception("Existen campos vacios");
        }else{
            if(!prv.getEmail().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
                throw new Exception("Email incorreto");
            }else if(prv.getRuc().length()!=11){
                throw new Exception("Ruc debe tener 11 digitos");
            }else if(prv.getTelefono().length()<6){
                throw new Exception("El telefono debe tener como minimo 6 digitos");
            }   
        }
    }
}