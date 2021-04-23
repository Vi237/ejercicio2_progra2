import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente vilma=new Cliente(1,"Vilma","caero","sandoval");
        //ciudad
        Ciudad cochabamba=new Ciudad(1,"cochabamba");
        Ciudad tarija=new Ciudad(2,"tarija");
        Ciudad santaCruz=new Ciudad(3,"santaCruz");
        Categoria turista=new Categoria(1,"turista");
        Aeropuerto jorgeWilstermann=new Aeropuerto("JM","jorgeWilstermann",cochabamba);
        Aeropuerto orielLea=new Aeropuerto("OL","orielLea",tarija);
        Aeropuerto viruViru=new Aeropuerto("VV","viru viru",santaCruz);
        List<Vuelo> vuelos=new ArrayList<>();
        Vuelo cochabambatarija=new Vuelo("BOA-158", Calendar.getInstance().getTime(),jorgeWilstermann,orielLea);
        vuelos.add(cochabambatarija);
        Vuelo santaCruzcochabamba=new Vuelo("BOA-159", Calendar.getInstance().getTime(), viruViru,jorgeWilstermann);
        vuelos.add(santaCruzcochabamba);
        Billete billete=new Billete(1,Calendar.getInstance().getTime(),556.32,vilma,cochabamba,tarija,turista,vuelos);

        System.out.println("id:" + billete.getIdBillete());
        System.out.println("fecha:"+ billete.getFechaEmision());
        System.out.println("precio total:"+ billete.getPrecioTotal());
        System.out.println("Cliente:"+ billete.getCliente().getNombre());
        System.out.println("origen:"+billete.getOrigen().getNombre());
        System.out.println("destino:"+billete.getDestino().getNombre());
        System.out.println("Categoria:"+billete.getCatrgoria().getNombre());

        System.out.println("Vuelos:");
        for (Vuelo vuelo:billete.getVuelos()){
            System.out.println("Codig vuelo:"+vuelo.getCodigoVuelo()+"| salida:"+vuelo.getSalida()+"| origen:"+vuelo.getOrigen().getNombre()+"|Destino:"+vuelo.getDestino().getNombre());
        }
    }
}