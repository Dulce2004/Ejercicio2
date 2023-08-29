public class Cliente { // se declaran los atributos
    private String nombre;
    private int tipo_clientes;

    // constructor
    public Cliente(String nombre, int tipo_clientes) {
        this.nombre = nombre;
        this.tipo_clientes = tipo_clientes;
    }

    // Getters y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo_clientes() {
        return tipo_clientes;
    }

    public void setTipo_clientes(int tipo_clientes) {
        this.tipo_clientes = tipo_clientes;
    }

}