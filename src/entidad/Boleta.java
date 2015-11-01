package entidad;
public class Boleta {
   private int  id;
   private String fecha;
   private String hora;
   private int idUser;
   private int idCliente;
   private double total;

    public Boleta(int id, String fecha, String hora, int idUser,int idCliente, double total) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.idUser = idUser;
        this.idCliente=idCliente;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
   
}
