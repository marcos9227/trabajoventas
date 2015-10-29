package entidad;
public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    
    public  Persona(String nom,String ap,int dni,String em){
        this.nombre=nom;
        this.apellido=ap;
        this.dni=dni;
        this.email=em;
        //this.img=img;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
