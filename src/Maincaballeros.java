import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Maincaballeros {

    public static Random random = new Random();
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Caballero> caballeros = new ArrayList<>();

    public static void iniciar() {
        int opcion;
        do {
            System.out.println("Este gestor le permitirá alguna de las siguientes opciones, por favor ingrese el numero de la opción que desea");
            System.out.println("1. Crear caballero");
            System.out.println("2. Mostrar caballeros registrados");
            System.out.println("3. Eliminar caballero");
            System.out.println("4. Batalla");
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
                case 4:
                    Batalla();
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
        if (rango.equals("oro")) {
            armadura = new Armaduraoro(constelacion, "Oro");
        } else {
            armadura = new Armadurabronce(constelacion, "Bronce");
        }

        Caballero nuevo = new Caballero(nombre, constelacion, "Caballero de Atena", armadura);
        caballeros.add(nuevo);
        System.out.println("El caballero ha sido creado.");
    }

    private static void mostrarCaballeros() {
        if (caballeros.isEmpty()) {
            System.out.println("No hay caballeros registrados.");
        } else {
            System.out.println("\nSe imprimirán los caballeros registrados");
            for (Caballero c : caballeros) {
                System.out.println(c);
            }
        }
    }

    private static void eliminarCaballero() {
        if (caballeros.isEmpty()) {
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

    public static void Batalla() {
        if (caballeros.size() < 2) {
            System.out.println("Ingrese más caballeros para iniciar una batalla.");
            return;
        }

        Caballero c1 = caballeros.get(random.nextInt(caballeros.size()));
        Caballero c2;
        do {
            c2 = caballeros.get(random.nextInt(caballeros.size()));
        } while (c1 == c2);

        System.out.println("¡¡Batalla!!");
        System.out.println(c1.nombre + " (" + c1.armadura.rango + ") VS " + c2.nombre + " (" + c2.armadura.rango + ")");
        System.out.println("¡¡FIGHT!!");

        int poder1 = calcularPoder(c1);
        int poder2 = calcularPoder(c2);

        if (poder1 > poder2) {
            System.out.println(c1.nombre + " ha ganado la batalla,");
        } else if (poder2 > poder1) {
            System.out.println(c2.nombre + " ha ganado la batalla");
        } else {
            System.out.println("¡¡Empate!!");
        }
    }

    public static int calcularPoder(Caballero c) {
        int bonusRango;
        String rango = c.armadura.rango.toLowerCase();

        if (rango.equals("oro")) {
            bonusRango = 50;
        } else if (rango.equals("plata")) {
            bonusRango = 30;
        } else if (rango.equals("bronce")) {
            bonusRango = 10;
        } else {
            bonusRango = 0;
        }

        int azar = random.nextInt(30);
        return c.cosmos + bonusRango + azar;
    }
}
