import java.util.ArrayList;
import java.util.Scanner;
public class Maincaballeros {


    static Scanner leer = new Scanner(System.in);
    static ArrayList<Caballero> caballeros = new ArrayList<>();

    public static void iniciar() {
        int opcion;
        do {
            System.out.println("Este gestor le permitirá alguna de las siguientes opciones, por favor ingrese el numero de la opción que desea");
            System.out.println("1. Crear caballero");
            System.out.println("2. Mostrar caballeros registrados");
            System.out.println("3. Eliminar caballero");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

           opcion = leer.nextInt();
           leer.nextLine();

            switch (opcion) {
                case 1:
                    crearCaballero();
                    break;
                case 2:
                    mostrarCaballeros();
                    break;
                case 3:
                    eliminarCaballero();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }

        } while (opcion != 0);
    }

    private static void crearCaballero() {
        System.out.print("Ingrese el nombre del caballero a crear: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese la constelación a la que pertenecerá: ");
        String constelacion = leer.nextLine();

        System.out.print("Ingrese su rango (Bronce/Oro): ");
        String rango = leer.nextLine().toLowerCase();

        Armadura armadura;
        if (rango == "oro") {
            armadura = new Armaduraoro(constelacion, "Oro");
        } else {
            armadura = new Armadurabronce(constelacion, "Bronce");
        }

        Caballero nuevo = new Caballero(nombre, constelacion, "Caballero de Atena", armadura);
        caballeros.add(nuevo);
        System.out.println("El caballero ha sido creado.");
    }

    private static void mostrarCaballeros() {
        if (caballeros==null) {
            System.out.println("No hay caballeros registrados.");
        } else {
            System.out.println("\nSe imprimirán los caballeros registrados");
            for (Caballero c : caballeros) {
                System.out.println(c);
            }
        }
    }

    private static void eliminarCaballero() {
        if (caballeros==null) {
            System.out.println("No hay caballeros para eliminar.");
            return;
        }
        System.out.print("Ingrese el nombre del caballero a eliminar: ");
        String nombre = leer.nextLine();

        boolean eliminado = caballeros.removeIf(c -> c.nombre.equalsIgnoreCase(nombre));
        if (eliminado) {
            System.out.println("El caballero ha sido eliminado.");
        } else {
            System.out.println("No se encontró un caballero con ese nombre.");
        }
    }
}
