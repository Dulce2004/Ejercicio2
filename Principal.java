
/**
* Ejercicio_2
* Se realiza una aplicación para que un empleado de un dicho hotel pueda ingresar los datos de un cliente
* para reservar una habitación según la frecuencia de visitas del cliente
* @author Dulce Ambrosio
* @version 1.0
* @since 26/08/2023
*/
import java.util.Scanner;

public class Principal {

    /**
     * Este método se encarga de iniciar la ejecución del programar
     * Éste es el método principal del proyecto
     * 
     * @param args[] es un arreglo con los parámetros que el reciba por consola
     * @return void
     */
    public static void main(String[] args) { // se declaran las variables con su tipo
        Scanner teclado = new Scanner(System.in);
        int maxClientes = 100;
        int maxHabitaciones = 50;
        Hotel hotel = new Hotel(maxClientes, maxHabitaciones);
        int opcion = 0;

        while (opcion != 3) { // se crea el ciclo para el menú
            System.out.println("--------------------------------");
            System.out.println("BIENVENIDO AL HOTEL ");
            System.out.println("Ingrese la opción que desee: ");

            System.out.println("1. Añadir Cliente");
            System.out.println("2. Mostrar lista de espera");
            System.out.println("3. Salir");

            opcion = teclado.nextInt();

            switch (opcion) { // se crea el switch para las opciones
                case 1:
                    hotel.AsignarCliente(); // se llama al metodo para asignar clientes
                    break;
                case 2:
                    hotel.listaEspera(); // se llama al metodo para la lista de espera
                    break;
                case 3:
                    break;

            }
        }

    }

}
