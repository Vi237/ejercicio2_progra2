public class Cliente {
    //atributos
     int idCliente;
     String nombre;
     String primerApellido;
     String SegundoApellido;

    public Cliente(int idCliente, String nombre, String primerApellido, String segundoApellido) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.SegundoApellido = segundoApellido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.SegundoApellido = segundoApellido;
    }

}
