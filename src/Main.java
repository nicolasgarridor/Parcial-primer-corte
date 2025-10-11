import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in);
    static String name;

    public static void main(String[] args) {
        System.out.println("Bienvenido, a continuación ingrese su nombre");
        Scanner leer = new Scanner(System.in);
        name = leer.nextLine();
        int opcion;

        do {
            System.out.println(name + ", seleccione una opción para mostrar : \n" +
                    "1. Zodiaco por mes y año de nacimiento\n" +
                    "2. Validador de mayoría de edad\n" +
                    "3. Validador numero perfecto\n" +
                    "4. Validador de palíndromo\n" +
                    "5. Validador de capicua\n" +
                    "6. Conversor de morse a texto\n" +
                    "7. Conversor de texto a morse\n" +
                    "8. Gestor de caballeros del zodíaco\n" +
                    "0. Salir del menú");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:

                case 0:

            }
            while (opcion > 0) ;
        }
    }


