public class Plaza {
   private int idPlaza;
   private Vuelo vuelo;
   private Categoria catrgoria;
   private int numeroPlazas;
   private double tarifa;

    public Plaza(int idPlaza, Vuelo vuelo, Categoria catrgoria, int numeroPlazas, double tarifa) {
        this.idPlaza = idPlaza;
        this.vuelo = vuelo;
        this.catrgoria = catrgoria;
        this.numeroPlazas = numeroPlazas;
        this.tarifa = tarifa;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Categoria getCatrgoria() {
        return catrgoria;
    }

    public void setCatrgoria(Categoria catrgoria) {
        this.catrgoria = catrgoria;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}
