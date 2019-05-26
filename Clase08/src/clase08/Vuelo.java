package clase08;
public class Vuelo {

    private String vuelo;
    private int cantidadPasajes;
    
    
    public synchronized void venderPasajes(int cantidad) throws NoHayMasPasajesException, IllegalArgumentException {
        if (cantidad>cantidadPasajes) throw new NoHayMasPasajesException(vuelo, cantidadPasajes);
        if (cantidad<0) throw new IllegalArgumentException();
        cantidadPasajes-=cantidad;        
    }
    

    public Vuelo(String vuelo, int cantidadPasajes) {
        this.vuelo = vuelo;
        this.cantidadPasajes = cantidadPasajes;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "vuelo=" + vuelo + ", cantidadPasajes=" + cantidadPasajes + '}';
    }

    public String getVuelo() {
        return vuelo;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }
    
    
}
