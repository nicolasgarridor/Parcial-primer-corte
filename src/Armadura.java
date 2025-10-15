public class Armadura {
    String nombre;
    String material;
    boolean activa;
    String rango;

    public Armadura(String nombre, String material, String rango) {
        this.nombre = nombre;
        this.material = material;
        this.rango = rango;
        this.activa = true;
    }

    public Armadura() {
        this("Desconocida", "Desconocido", "Sin rango");
    }

    @Override
    public String toString() {
        return "Armadura de " + rango + " llamada " + nombre + " (" + material + ")";
    }
}
