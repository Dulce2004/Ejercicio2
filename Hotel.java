import java.util.Scanner;

public class Hotel { // se crean las listas
    public Habitacion[] habitaciones;
    public Cliente[] clientess;
    public Cliente[] espera;

    Scanner teclado = new Scanner(System.in);

    public Hotel(int maxClientes, int maxHabitaciones) {
        clientess = new Cliente[maxClientes];
        espera = new Cliente[maxClientes];
        habitaciones = new Habitacion[maxHabitaciones];
    }
    // getters y setters

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public Cliente[] getEspera() {
        return espera;
    }

    public void setEspera(Cliente[] espera) {
        this.espera = espera;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Cliente[] getClientess() {
        return clientess;
    }

    public void setClientess(Cliente[] clientess) {
        this.clientess = clientess;
    }

    /**
     * Este método se encarga de crear las habitaciones
     * 
     * @author Dulce Ambrosio
     */
    public void crearHabitacion() {
        int indiceHabitaciones = 0;
        System.out.println("Ingrese el número de la habitación: ");
        int num_habitacion = teclado.nextInt();
        System.out.println("Ingrese la capacidad máxima de la habitación: ");
        int cap_max = teclado.nextInt();
        System.out.println("Ingrese el precio de la habitación");
        float precio = teclado.nextFloat();

        System.out.println("Ingrese la opción del tipo de habitación: ");
        System.out.println("1. Estándar");
        System.out.println("2. Deluxe");
        System.out.println("3. Suites");
        int tipo_habitaciones = teclado.nextInt();

        Habitacion habitacionesCliente = new Habitacion(num_habitacion, cap_max, precio, tipo_habitaciones);

        if (indiceHabitaciones < habitaciones.length) {
            habitaciones[indiceHabitaciones] = habitacionesCliente;
            indiceHabitaciones++;
        } else {
            System.out.println("El arreglo de clientes está lleno.");
        }
    }

    /**
     * Este método se encarga de asignar a los clientes
     * 
     * @author Dulce Ambrosio
     */
    public void AsignarCliente() {
        int indiceClientes = 0;

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese la opción del tipo del cliente: ");
        System.out.println("1. Regulares");
        System.out.println("2. Frecuentes");
        System.out.println("3. VIP");
        int tipo_clientes = teclado.nextInt();

        Cliente huesped = new Cliente(nombre, tipo_clientes);

        if (indiceClientes < clientess.length) {
            clientess[indiceClientes] = huesped;
            indiceClientes++;
        } else {
            System.out.println("El arreglo de clientes está lleno.");
        }

    }

    /**
     * Este método se encarga de crear la lista de espera
     * 
     * @author Dulce Ambrosio
     */
    public void listaEspera() {
        System.out.println("Clientes en lista de espera:");

        for (int i = 0; i < espera.length; i++) {
            if (espera[i] != null) {
                System.out.println((i + 1) + ". " + espera[i].getNombre());
            }
        }
    }

}
