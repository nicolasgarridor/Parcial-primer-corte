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
                    signozodiacal();
                    break;

                case 2:
                    mayordeedad();
                    break;

                case 3:
                    numeroperfecto();
                    break;

                case 4:
                    palindromo();
                    break;

                case 5:
                    capicua();
                    break;

                case 6:
                    morseatexto();
                    break;

                case 7:
                    //textoamorse();
                    break;

                case 8:
                    //gestorcaballeros();
                    break;

                case 9:
                    //juegolibre();
                    break;

                case 0:
                    System.out.println(name + ", hasta luego");
                    break;
                default:
                    System.out.println(name + ", la opción que ingresó no es válida, inténtelo de nuevo");


            }

        } while (opcion > 0) ;
    }

    public static void mayordeedad() {
        System.out.println(name + ", enter your birth year.");
        int year = leer.nextInt();
        year = 2025 - year;
        if (year >= 18) {
            System.out.println(name + ", eres mayor de edad.");
        } else {
            System.out.println(name + ", no eres mayor de edad.");
        }
    }

        public static void signozodiacal () {
            System.out.println(name + ", ingresa tu dia de nacimiento");
            int dia = leer.nextInt();
            System.out.println(name + ", ingresa tu mes de nacimiento en numeros");
            int mes = leer.nextInt();
            String signozodiacal = signozodiacal2(dia, mes);
            System.out.println(name + ", tu signo zodiacal es: " + signozodiacal);
        }

        public static String signozodiacal2( int dia, int mes){
            String resultado = "fecha no valida";
            if (mes >= 1) {
                if (mes <= 12) {

                    if (dia >= 1) {
                        if (dia <= 31) {

                            if (mes == 1) {
                                if (dia <= 19) {
                                    resultado = "Capricornio";
                                }

                                if (dia >= 20) {
                                    resultado = "Acuario";
                                }
                            }

                            if (mes == 2) {
                                if (dia <= 18) {
                                    resultado = "Acuario";
                                }

                                if (dia >= 19) {
                                    resultado = "Piscis";
                                }
                            }

                            if (mes == 3) {
                                if (dia <= 20) {
                                    resultado = "Piscis";
                                }

                                if (dia >= 21) {
                                    resultado = "Aries";
                                }
                            }

                            if (mes == 4) {
                                if (dia <= 19) {
                                    resultado = "Aries";
                                }

                                if (dia >= 20) {
                                    resultado = "Tauro";
                                }
                            }

                            if (mes == 5) {
                                if (dia <= 20) {
                                    resultado = "Tauro";
                                }

                                if (dia >= 21) {
                                    resultado = "Geminis";
                                }
                            }

                            if (mes == 6) {
                                if (dia <= 20) {
                                    resultado = "Geminis";
                                }

                                if (dia >= 21) {
                                    resultado = "Cancer";
                                }
                            }

                            if (mes == 7) {
                                if (dia <= 22) {
                                    resultado = "Cancer";
                                }

                                if (dia >= 23) {
                                    resultado = "Leo";
                                }
                            }

                            if (mes == 8) {
                                if (dia <= 22) {
                                    resultado = "Leo";
                                }

                                if (dia >= 23) {
                                    resultado = "Virgo";
                                }
                            }

                            if (mes == 9) {
                                if (dia <= 22) {
                                    resultado = "Virgo";
                                }

                                if (dia >= 23) {
                                    resultado = "Libra";
                                }
                            }

                            if (mes == 10) {
                                if (dia <= 22) {
                                    resultado = "Libra";
                                }

                                if (dia >= 23) {
                                    resultado = "Escorpio";
                                }
                            }

                            if (mes == 11) {
                                if (dia <= 21) {
                                    resultado = "Escorpio";
                                }

                                if (dia >= 22) {
                                    resultado = "Sagitario";
                                }
                            }

                            if (mes == 12) {
                                if (dia <= 21) {
                                    resultado = "Sagitario";
                                }

                                if (dia >= 22) {
                                    resultado = "Capricornio";
                                }
                            }

                        } else {
                            resultado = "error, el dia que ingresaste es mayor a 31, intenta de nuevo";
                        }
                    } else {
                        resultado = "error, el dia que ingresaste es menor a 1, intenta de nuevo";
                    }
                } else {
                    resultado = "error, el mes que ingresaste es mayor que 12, intenta de nuevo";
                }
            } else {
                resultado = "error, el mes que ingresaste es menor que 1, intenta de nuevo";
            }

            return resultado;
        }
    public static void numeroperfecto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", ingresa un número entero positivo ");
        int numero = scanner.nextInt();
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;}
        }
        if (sumaDivisores == numero) {
            System.out.println(name + ", " + numero + " es un número perfecto.");
        } else {
            System.out.println(name + ", " + numero + " no es un número perfecto.");
        }
    }
    public static void palindromo(){
        leer = new Scanner(System.in);
        System.out.println(name + ", ingrese una palabra para validar si es palindromo");
        String palabra = leer.nextLine();

        String reves = "";
        int i = palabra.length() - 1;
        while (i >= 0) {
            reves = reves + palabra.charAt(i);
            i = i - 1;}
        if (palabra.equals(reves)) {
            System.out.println(name + ", " + palabra + " es una palabra palíndromo.");
        } else {
            System.out.println(name + ", " + palabra + " no es una palabra palíndromo.");
        }
    }
    public static void capicua(){
        leer = new Scanner(System.in);

        System.out.println(name + ", ingrese un número entero");
        int numero = leer.nextInt();

        if (capicua(numero)) {
            System.out.println( name + ", " + numero + " es un número capicúa.");
        } else {
            System.out.println(name + ", " + numero + " no es un número capicúa.");
        }
    }
    public static boolean capicua(int numero) {int numerooriginal = numero;
        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }
        return numerooriginal == invertido;
    }
    public static void morseatexto() {
        System.out.println(name + ", ingresa el texto en código Morse. Se recomienda el uso de slash (/) para separar las palabras");
        String morse = leer.nextLine();

        if (morse.length() == 0) {
            morse = leer.nextLine();
        }

        String resultado = "";
        String codigo = "";
        int i = 0;

        while (i < morse.length()) {
            char m = morse.charAt(i);

            if (m == ' ') {
                if (codigo.length() > 0) {
                    resultado = resultado + morse(codigo);
                    codigo = "";
                }
            } else {
                if (m == '/') {
                    if (codigo.length() > 0) {
                        resultado = resultado + morse(codigo);
                        codigo = "";
                    }
                    resultado = resultado + " ";
                } else {
                    codigo = codigo + m;
                }
            }

            if (i == morse.length() - 1) {
                if (codigo.length() > 0) {
                    resultado = resultado + morse(codigo);
                }
            }

            i = i + 1;
        }

        System.out.println(name + ", el texto traducido del código Morse es: " + resultado);
    }

    public static String morse(String codigo) {
        String letra = "";

        switch (codigo) {
            case ".-": letra = "A"; break;
            case "-...": letra = "B"; break;
            case "-.-.": letra = "C"; break;
            case "-..": letra = "D"; break;
            case ".": letra = "E"; break;
            case "..-.": letra = "F"; break;
            case "--.": letra = "G"; break;
            case "....": letra = "H"; break;
            case "..": letra = "I"; break;
            case ".---": letra = "J"; break;
            case "-.-": letra = "K"; break;
            case ".-..": letra = "L"; break;
            case "--": letra = "M"; break;
            case "-.": letra = "N"; break;
            case "---": letra = "O"; break;
            case ".--.": letra = "P"; break;
            case "--.-": letra = "Q"; break;
            case ".-.": letra = "R"; break;
            case "...": letra = "S"; break;
            case "-": letra = "T"; break;
            case "..-": letra = "U"; break;
            case "...-": letra = "V"; break;
            case ".--": letra = "W"; break;
            case "-..-": letra = "X"; break;
            case "-.--": letra = "Y"; break;
            case "--..": letra = "Z"; break;
            case "-----": letra = "0"; break;
            case ".----": letra = "1"; break;
            case "..---": letra = "2"; break;
            case "...--": letra = "3"; break;
            case "....-": letra = "4"; break;
            case ".....": letra = "5"; break;
            case "-....": letra = "6"; break;
            case "--...": letra = "7"; break;
            case "---..": letra = "8"; break;
            case "----.": letra = "9"; break;
            default: letra = ""; break;
        }

        return letra;
    }

}



