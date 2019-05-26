package clase08;
public class NoHayMasPasajesException extends Exception{
    
    private String vuelo;
    private int cantidadPasajes;

    public NoHayMasPasajesException(String vuelo, int cantidadPasajes) {
        this.vuelo = vuelo;
        this.cantidadPasajes = cantidadPasajes;
    }

    @Override
    public String toString() {
        return ("El vuelo "+ vuelo + " no tiene "+cantidadPasajes+ "Pasajes");
    }

    public String getVuelo() {
        return vuelo;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }
    
    
    
}
