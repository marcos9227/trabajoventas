package entidad;
public class Proveedor {
    private String ruc;
    private String telefono;
    private String razonsocial,direccion,email;
    public Proveedor(String ruc,String razon, String dir,String tel,String ema){
        this.ruc=ruc;
        this.razonsocial=razon;
        this.direccion=dir;
        this.telefono=tel;
        this.email=ema;
    }
    public String getRuc(){
        return ruc;
    }
    public void setRuc(String ruc){
        this.ruc=ruc;
    }
    public String getRazonsocial(){
        return razonsocial;
    }
    public void setRazonsocial(String razon){
        this.razonsocial=razon;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String dir){
        this.direccion=dir;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String tel) {
        this.telefono = tel;
    } 
    public String getEmail(){
        return email;
    }
    public void setEmail(String ema){
        this.email=ema;
    }
}
