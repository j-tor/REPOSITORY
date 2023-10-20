


public class Ticket {

    private String nombrePasajero;
    private double totalpagado;

    public Ticket(String nombrePasajero, double totalpagado) {
        this.nombrePasajero = nombrePasajero;
        this.totalpagado = 800;
    }

    public String getnombrePasajero() {
        return nombrePasajero;
    }

    public double gettotalpagado() {
        return totalpagado;
    }

    public String print() {
        String print = "- Nombre del Pasajero: " + this.nombrePasajero + "- Total pagado : " + this.totalpagado;
        return print;
    }

}
