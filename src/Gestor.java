import java.util.ArrayList;

public class Gestor {
    private ArrayList<Caballero> caballeros = new ArrayList<>();

    public void agregar(Caballero c) {
        caballeros.add(c);
    }

    public void mostrar() {
        if (caballeros.isEmpty()) {
            System.out.println("No hay caballeros registrados aún.");
        } else {
            System.out.println("Caballeros registrados:");
            for (Caballero c : caballeros) {
                System.out.println(c);
            }
        }
    }

    public void eliminarCaballero(String nombre) {
        caballeros.removeIf(c -> c.nombre.equalsIgnoreCase(nombre));
    }
}
