public class Habitacion { // se declaran los atributos
    private int num_habitacion;
    private int cap_max;
    private float precio;
    private int tipo_habitaciones;

    private Cliente cliente;

    // constructor
    public Habitacion(int num_habitacion, int cap_max, float precio, int tipo_habitaciones) {
        this.num_habitacion = num_habitacion;
        this.cap_max = cap_max;
        this.precio = precio;
        this.tipo_habitaciones = tipo_habitaciones;
    }

    // Getter y Setters
    public int getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(int num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public int getCap_max() {
        return cap_max;
    }

    public void setCap_max(int cap_max) {
        this.cap_max = cap_max;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getTipo_habitaciones() {
        return tipo_habitaciones;
    }

    public void setTipo_habitaciones(int tipo_habitaciones) {
        this.tipo_habitaciones = tipo_habitaciones;
    }

}
