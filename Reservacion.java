public class Reservacion {// se declaran los atributos
    private Habitacion habitacion;
    private Cliente cliente;

    // getters y setters
    public Reservacion(Habitacion habitacion, Cliente cliente) {
        this.habitacion = habitacion;
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}