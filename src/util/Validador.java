package util;
import entidad.Producto;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Validador {  
    public void validarStock(Producto p) throws Exception{
        if(p.getStock() < 0){
            throw new Exception("El Stock debe ser Negativo");
        }
    }
    public void validarDni(JTextField campo){
        if(campo.getText().length()!=8){
            JOptionPane.showMessageDialog(null, "El dni debe tener 8 digitos","Advertencia",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void validarEmail(JTextField campo){
        if(!campo.getText().matches("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$")){
            JOptionPane.showMessageDialog(null, "Correo incorreto","Advertencia",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void ingresarSoloNumeros(JTextField campo){
        if(! campo.getText().matches("[0-9--]*")){
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros ","Advertencia",JOptionPane.ERROR_MESSAGE);
            campo.setText("");
            campo.requestFocus();           
        }
    }
}