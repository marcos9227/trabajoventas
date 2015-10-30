package entidad;
public class Medida {
    private String medida;
    private String descripcion;
    public Medida(){
        this.medida="";
        this.descripcion="";
    }
    public Medida(String medida,String descripcion){
        this.medida=medida;
        this.descripcion=descripcion;
    }
    public String getMedida(){
        return medida;
    }
    public void setMedida(String medida){
        this.medida=medida;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
}