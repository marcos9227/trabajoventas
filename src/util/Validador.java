package util;
import entidad.Producto;
public class Validador {  
    public void validarStock(Producto p) throws Exception{
        if(p.getStock() < 0){
            throw new Exception("El Stock debe ser Negativo");
        }
    }
}