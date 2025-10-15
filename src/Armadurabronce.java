public class Armadurabronce extends Armadura {
    String simbolo;

    public Armadurabronce(String nombre, String simbolo) {
        super(nombre, "Bronce Celestial", "Bronce");
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return super.toString() + " con el símbolo de " + simbolo;
    }
}
