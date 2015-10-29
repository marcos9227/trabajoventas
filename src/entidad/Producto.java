package entidad;
public class Producto {
    private String nombreProd;
    private double precio;
    private int stock;
    private int idMedida;
    private String img;
    private int idTipoProd;
    public Producto(){
        this.nombreProd="";
        this.precio=0.0;
        this.stock=0;
        this.idMedida=0;
        this.img="";
        this.idTipoProd=0;
    }
    public Producto(String nombreProd, double precio,int stock,int idMedida,String img,int idTipoProd){
        this.nombreProd=nombreProd;
        this.precio=precio;
        this.stock=stock;
        this.idMedida=idMedida;
        this.img=img;
        this.idTipoProd=idTipoProd;
    }
    public String getNombreProd(){
        return nombreProd;
    }
    public void setNombreProd(String nombreProd){
        this.nombreProd=nombreProd;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public int getIdMedida(){
        return idMedida;
    }
    public void setIdMedida(int idMedida){
        this.idMedida=idMedida;   
    }
    public String getImg(){
        return img;
    }
    public void setImg(String img){
        this.img=img;   
    }
    public int getIdTipoProd(){
        return idTipoProd;
    }
    public void setIdTipoProd(int idTipoProd){
        this.idTipoProd=idTipoProd;
    }
}