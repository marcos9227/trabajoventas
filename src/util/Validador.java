package util;
import entidad.Persona;
import entidad.Producto;
public class Validador {  
    public void validarStock(Producto p) throws Exception{
        if(p.getStock() < 0){
            throw new Exception("El Stock debe ser Negativo");
        }
    }
    public void validarDni(Persona p) throws Exception{
        String dig= Integer.toString(p.getDni());
        if(p.getDni()<0){
            throw new Exception("El Dni es Negativo");
        }else if(dig.length()>8||dig.length()<8){
            throw new Exception("El Dni no tiene 8 digitos");
        }
    }
}