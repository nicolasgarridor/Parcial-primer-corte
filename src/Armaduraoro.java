public class Armaduraoro extends Armadura {
    String signoZodiacal;

    public Armaduraoro(String nombre, String signoZodiacal) {
        super(nombre, "Oro Divino", "Oro");
        this.signoZodiacal = signoZodiacal;
    }

    @Override
    public String toString() {
        return super.toString() + " correspondiente al signo de " + signoZodiacal;
    }
}
