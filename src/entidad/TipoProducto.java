package entidad;
public class TipoProducto {
    private String tipoProd;
    private String descripcion;
    public TipoProducto(){
        this.tipoProd="";
        this.descripcion="";
    }
    public TipoProducto(String tipoProd,String descripcion){
        this.tipoProd=tipoProd;
        this.descripcion=descripcion;
    }
    public String getTipoProd(){
        return tipoProd;
    }
    public void setTipoProd(String tipoProd){
        this.tipoProd=tipoProd;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
}