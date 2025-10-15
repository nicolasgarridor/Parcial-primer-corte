import java.util.ArrayList;

public class Gestor {
    private static ArrayList<Caballero> caballeros = new ArrayList<>();

    public static void agregar(Caballero c) {
        caballeros.add(c);
        System.out.println("Caballero agregado: " + c.nombre);
    }

    public static void mostrar() {
        if (caballeros.isEmpty()) {
            System.out.println("No hay caballeros registrados aún.");
        } else {
            System.out.println("\n--- CABALLEROS REGISTRADOS ---");
            for (Caballero c : caballeros) {
                System.out.println(c);
            }
        }
    }

    public static void eliminarCaballero(String nombre) {
        caballeros.removeIf(c -> c.nombre.equalsIgnoreCase(nombre));
        System.out.println("Caballero " + nombre + " eliminado del registro.");
    }
}

