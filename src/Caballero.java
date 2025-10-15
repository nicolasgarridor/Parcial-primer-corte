public class Caballero {
    String nombre;
    String constelacion;
    int cosmos;
    String orden;
    Armadura armadura;

    public Caballero(String nombre, String constelacion, String orden, Armadura armadura) {
        this.nombre = nombre;
        this.constelacion = constelacion;
        this.orden = orden;
        this.armadura = armadura;
        this.cosmos = 100;
    }

    public Caballero() {
        this("Desconocido", "Sin constelación", "Sin orden", new Armadura());
    }

    @Override
    public String toString() {
        return nombre + ", Caballero de " + constelacion + " (" + orden + ") con " + cosmos + " de cosmos.\n"
                + "→ " + armadura;
    }

    public void aumentarCosmos() {
        cosmos += 10;
    }

    public void aumentarCosmos(int cantidad) {
        cosmos += cantidad;
    }}