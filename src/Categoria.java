public class Categoria {
    private int idCtegoria;
    String nombre;

    public Categoria(int idCtegoria, String nombre) {
        this.idCtegoria = idCtegoria;
        this.nombre = nombre;
    }

    public int getIdCtegoria() {
        return idCtegoria;
    }

    public void setIdCtegoria(int idCtegoria) {
        this.idCtegoria = idCtegoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
