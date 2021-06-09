package Guia1;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.*;

import static Guia1.Utils.*;

public class Main {
    /*
    * Hola Sergio, Laureano, Ariel, Flor, Florencia, Bianca y yo
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        String decision;
        System.out.println("normal o extra?");
        while (seguir) {
            decision = sc.nextLine().toLowerCase();
            if (decision.equals("n") || decision.equals("normal")) {
                mostrarEj(sc);
                seguir = false;
            } else if (decision.equals("x") || decision.equals("extra")) {
                mostrarEjX(sc);
                seguir = false;
            } else {
                System.out.println("Incorrecto, normal o extra?");
            }
            sc = new Scanner(System.in);
        }
        sc.close();
    }

    public static void mostrarEj(Scanner sc) {
        int ej;
        ej = 1;
        while (ej > 0 && ej < 29) {
            System.out.println("Normal:\nIngresa numero de ejercicio, otro para salir");
            ej = sc.nextInt();
            sc = new Scanner(System.in);
            switch (ej) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2(sc);
                case 3 -> ejercicio3(sc);
                case 4 -> ejercicio4(sc);
                case 5 -> ejercicio5(sc);
                case 6 -> ejercicio6(sc);
                case 7 -> ejercicio7(sc);
                case 8 -> ejercicio8(sc);
                case 9 -> ejercicio9(sc);
                case 10 -> ejercicio10(sc);
                case 11 -> ejercicio11(sc);
                case 12 -> ejercicio12(sc);
                case 13 -> ejercicio13(sc);
                case 14 -> ejercicio14(sc);
                case 15 -> ejercicio15(sc);
                case 16 -> ejercicio16(sc);
                case 17 -> ejercicio17(sc);
                case 18 -> ejercicio18();
                case 19 -> ejercicio19(sc);
                case 20 -> ejercicio20(sc);
                case 21 -> ejercicio21(sc);
                case 22 -> ejercicio22();
                case 23 -> ejercicio23(sc);
                case 24 -> ejercicio24(sc);
                case 25 -> ejercicio25();
                case 26 -> ejercicio26();
                case 27 -> ejercicio27();
                case 28 -> ejercicio28();
                default -> System.out.println("Adios");
            }
        }
    }

    public static void mostrarEjX(Scanner sc) {
        int ej;
        ej = 1;
        while (ej > 0 && ej < 24) {
            System.out.println("Extra:\nIngresa numero de ejercicio, otro para salir");
            ej = sc.nextInt();
            sc = new Scanner(System.in);
            switch (ej) {
                case 1 -> ejercicio1x(sc);
                case 2 -> ejercicio2x();
                case 3 -> ejercicio3x(sc);
                case 4 -> ejercicio4x(sc);
                case 5 -> ejercicio5x(sc);
                case 6 -> ejercicio6x(sc);
                case 7 -> ejercicio7x(sc);
                case 8 -> ejercicio8x(sc);
                case 9 -> ejercicio9x(sc);
                case 10 -> ejercicio10x(sc);
                case 11 -> ejercicio11x(sc);
                case 12 -> ejercicio12x(sc);
                case 13 -> ejercicio13x(sc);
                case 14 -> ejercicio14x(sc);
                case 15 -> ejercicio15x(sc);
                case 16 -> ejercicio16x(sc);
                case 17 -> ejercicio17x(sc);
                case 18 -> ejercicio18x(sc);
                case 19 -> ejercicio19x();
                case 20 -> ejercicio20x(sc);
                case 21 -> ejercicio21x();
                case 22 -> ejercicio22x();
                case 23 -> ejercicio23x(sc);
                default -> System.out.println("Adios");
            }
        }
    }

    public static void ejercicio1() {
        System.out.println("El ejercicio 1 era instalar el ide");
    }

    public static void ejercicio2(Scanner sc) {
        System.out.println("*****Ejercicio 2*****");
        /*
         * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma.
         * */
        int num1, num2;

        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
        System.out.println("\n*****Ejercicio 2 terminado*****\n");
    }


    public static void ejercicio3(Scanner sc) {
        System.out.println("*****Ejercicio 3*****");
        /* Escribir un pograma que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. */
        String nombre;

        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();

        System.out.printf("Tu nombre es %s \n", nombre);
        System.out.println("*****Ejercicio 3 terminado*****\n");
    }


    public static void ejercicio4(Scanner sc) {
        System.out.println("*****Ejercicio 4*****");
        /* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.*/
        String frase;

        System.out.println("Escriba una frase");
        frase = sc.nextLine();

        System.out.println("Mayusculas: " + frase.toUpperCase());
        System.out.println("MINUSCULAS: " + frase.toLowerCase());
        System.out.println("*****Ejercicio 4 terminado*****");
    }


    public static void ejercicio5(Scanner sc) {
        System.out.println("*****Ejercicio 5*****");
        /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5) */
        double gradosC, gradosF;

        System.out.println("Ingrese la temperatura en grados centígrados:");
        gradosC = sc.nextDouble();
        gradosF = 32 + (9 * gradosC / 5);

        System.out.printf(Locale.US, "%.2f C° = %.2f F° \n", gradosC, gradosF);
        System.out.println("*****Ejercicio 5 terminado*****");
    }


    public static void ejercicio6(Scanner sc) {
        System.out.println("*****Ejercicio 6*****");
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.*/
        int num;

        System.out.println("Ingrese un número entero");
        num = sc.nextInt();

        System.out.printf("El doble de %d es %d \n", num, num * 2);
        System.out.printf("El triple de %d es %d \n", num, num * 3);
        System.out.printf("La raíz cuadrada de %d es %.2f \n", num, Math.sqrt(num));

        System.out.println("*****Ejercicio 6 terminado*****");
    }


    public static void ejercicio7(Scanner sc) {
        System.out.println("*****Ejercicio 7*****");
        /* Implementar un programa que dado dos numeros enteros determine cuál es el mayor y lo muestre por pantalla */
        int num1, num2;

        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        System.out.println("El numero mas alto es " + Math.max(num1, num2));
        System.out.println("*****Ejercicio 7 terminado*****");
    }


    public static void ejercicio8(Scanner sc) {
        System.out.println("*****Ejercicio 8*****");
        /* Crear un programa que dado un numero determine si es par o impar */
        int num;

        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        System.out.println(num % 2 == 0 ? "El numero ingresado es par" : "El numero ingresado es impar");
        System.out.println("*****Ejercicio 8 terminado*****");
    }


    public static void ejercicio9(Scanner sc) {
        System.out.println("*****Ejercicio 9*****");
        /*Crear un programa que pida una frase y si esa frase es igual a "eureka" el programa pondrá un mensaje de Correcto, sino mostrará un mensaje Incorrecto*/
        String frase;

        System.out.println("Ingrese \"eureka\"");
        frase = sc.nextLine();

        System.out.println(frase.equals("eureka") ? "CORECTO" : "INCORRECTO");
        System.out.println("*****Ejercicio 9 terminado*****");
    }


    public static void ejercicio10(Scanner sc) {
        System.out.println("*****Ejercicio 10*****");
        /* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
        Si el usuario ingresa una frase o palabra de 8 de largo se deberá impimir "CORRECTO", en caso contrario, "INCORRECTO"*/
        String frase;

        System.out.println("Ingrese una frase de 8 de largo");
        frase = sc.nextLine();

        System.out.println(frase.length() == 8 ? "CORRECTO" : "INCORRECTO");
        System.out.println("*****Ejercicio 10 terminado*****");
    }


    public static void ejercicio11(Scanner sc) {
        System.out.println("*****Ejercicio 11*****");
        /* Escriba un programa que pida una frase y valide si la primera letra de esa frase es una 'A',
         * imprimir un mensaje por pantalla que diga "CORRECTO" o "INCORRECTO" segun el caso */
        String frase;

        System.out.println("Ingrese una frase o palabra que comience con A");
        frase = sc.nextLine();

        System.out.println(frase.toLowerCase().charAt(0) == 'A' ? "CORRECTO" : "INCORRECTO");
        System.out.println("*****Ejercicio 11 terminado*****");
    }


    public static void ejercicio12(Scanner sc) {
        System.out.println("*****Ejercicio 12*****");
        /* Considera que estás desarrollando una web para una empresa que fabrica motores
         * (suponemos que se trata del tipo de motor de una bomba para mover fluidos)
         * Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
         * El programa debe mostrar lo siguiente:
         * Si el tipo de motor es 1, un mensaje que indique "La bomba es una bomba de agua"
         * Si el tipo de motor es 2, un mensaje que indique "La bomba es una bomba de gasolina"
         * Si el tipo de motor es 3, un mensaje que indique "La bomba es una bomba de hormigón"
         * Si el tipo de motor es 4, un mensaje que indique "La bomba es una bomba de pasta alimenticia"
         * Si no se cumple ninguno de los valores anteriores mostrar "No existe un valor válido para tipo de bomba" */
        int tipoMotor;
        String mensajeBomba = "La bomba es una bomba de ";

        System.out.println("Ingrese el tipo de motor");
        tipoMotor = sc.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println(mensajeBomba + "agua");
                break;
            case 2:
                System.out.println(mensajeBomba + "gasolina");
                break;
            case 3:
                System.out.println(mensajeBomba + "hormigón");
                break;
            case 4:
                System.out.println(mensajeBomba + "pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bomba");
        }
        System.out.println("*****Ejercicio 12 terminado*****");
    }


    public static void ejercicio13(Scanner sc) {
        System.out.println("*****Ejercicio 13*****");
        /* Escriba un programa que valide si una nota está entre 0 y 10, si no está entre 0 y 10 la nota se pedirá hasta que sea correcta */
        int nota;
        System.out.println("Ingrese una nota entre 0 y 10");
        nota = sc.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Error, ingrese una nota entre 0 y 10");
            nota = sc.nextInt();
        }
        System.out.println("CORRECTO");
        System.out.println("*****Ejercicio 13 terminado*****");
    }


    public static void ejercicio14(Scanner sc) {
        System.out.println("*****Ejercicio 14*****");
        /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
         * números al usuario hasta que la suma de los números introducidos supere el límite inicial. */
        int limite, suma;

        System.out.println("Ingrese un valor limite");
        limite = sc.nextInt();

        System.out.println("Ingrese un valor para sumar hasta alcanzar el limite de: " + limite);
        suma = sc.nextInt();

        while (suma <= limite) {
            System.out.println("Suma actual: " + suma + ". Ingrese otro numero");
            suma += sc.nextInt();
        }

        System.out.println("Suma actual: " + suma + ". Limite de " + limite + " superado.");
        System.out.println("*****Ejercicio 14 terminado*****");
    }


    public static void ejercicio15(Scanner sc) {
        System.out.println("*****Ejercicio 15*****");
        /* Realizar un programa que pida dos numeros por teclado y realiza un menú:
         * 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir, 5. Salir*/
        int num1, num2, input;
        String menu = """
                -------------------
                |     MENU         |
                |   1. Sumar       |
                |   2. Restar      |
                |   3. Multiplicar |
                |   4. Dividir     |
                |   5. Salir       |
                |   Elija opción:  |
                -------------------""";
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        input = 2;

        while (input != -1) {
            System.out.println(menu);
            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1 -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                case 2 -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                case 3 -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                case 4 -> System.out.println(num2 != 0 ? (num1 + "/" + num2 + " = " + (double) (num1 / num2)) : "No se puede dividir por cero");
                case 5 -> {
                    System.out.println("Está seguro que desea salir? (S/N)");
                    input = sc.nextLine().equalsIgnoreCase("s") ? -1 : 5;
                }
                default -> System.out.println("ERROR, opcion invalida");
            }
        }
        System.out.println("*****Ejercicio 15 terminado*****");
    }


    public static void ejercicio16(Scanner sc) {
        System.out.println("*****Ejercicio 16*****");
        /* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje
         * "Se capturó el numero cero". El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
         * pero si el número es negativo no debe sumarse*/
        int suma, input;
        suma = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            input = sc.nextInt();
            if (input < 0) {
                System.out.println("numero negativo, no se tendrá en cuenta en la suma");
            } else if (input == 0) {
                System.out.println("Se capturó el número cero");
                break;
            } else {
                suma += input;
            }
        }
        System.out.println("La suma de numeros permitidos es de: " + suma);

        System.out.println("*****Ejercicio 16 terminado*****");
    }


    public static void ejercicio17(Scanner sc) {
        System.out.println("*****Ejercicio 17*****");
        /* Realizar un programa que simule el funcionamiento de un dispositivo RS232,
         * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
         * tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el ultimo O
         * Las secuencias leídas que respeten el formato se consideran correctas,
         * la secuencia especial "&&&&&" marca el final de los envíos (llamémosla FDE)
         * y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
         * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas*/
        String cad;
        int correctas = 0, incorrectas = 0;

        System.out.println("Ingrese una cadena");
        cad = sc.nextLine();

        while (!cad.equals("&&&&&")) {
            cad = cad.toUpperCase();
            if (cad.length() <= 5 && cad.charAt(0) == 'X' && cad.charAt(cad.length() - 1) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }
            System.out.println("Ingrese otra cadena");
            cad = sc.nextLine();
        }
        System.out.println("Saliendo");
        System.out.println("Ha ingresado " + correctas + " cadenas correctas y " + incorrectas + " cadenas incorrectas");
        System.out.println("*****Ejercicio 17 terminado*****");
    }


    public static void ejercicio18() {
        System.out.println("*****Ejercicio 18*****");
        /* Necesitamos mostrar un contador con 3 dígitos (X-X-X) que mueste los números del 0-0-0 al 9-9-9
         * Con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
         * 0-1-1, 0-1-2, 0-1-E, etc*/
        char aux = 'E';
        char frst, scnd, thrd;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    frst = i == 3 ? aux : Character.forDigit(i, 10);
                    scnd = j == 3 ? aux : Character.forDigit(j, 10);
                    thrd = k == 3 ? aux : Character.forDigit(k, 10);
                    System.out.printf("%c-%c-%c \n", frst, scnd, thrd);
                }
            }
        }
        System.out.println("*****Ejercicio 18 terminado*****");
    }


    public static void ejercicio19(Scanner sc) {
        System.out.println("*****Ejercicio 19*****");
        /* Dibujar un cuadrado de N elementos por lado utilizando el caractér '*' */
        int n;
        System.out.println("Ingrese tamaño del cuadrado");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((j != 0 && j != n - 1) && (i != 0 && i != n - 1) ? "  " : "* ");
            }
            System.out.println();
        }
        System.out.println("*****Ejercicio 19 terminado*****");
    }


    public static void ejercicio20(Scanner sc) {
        System.out.println("*****Ejercicio 20*****");
        /* Reailzar un programa que lea 4 nums (entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. */
        int n;
        System.out.println("Ingrese el numero entre 1 y 20 a mostrar");
        n = sc.nextInt();
        while (n < 1 || n > 20) {
            System.out.println("Incorrecto, ingrese un num entre 1 y 20");
            n = sc.nextInt();
        }
        System.out.print(n + " ");
        for (int i = 0; i < n; i++) System.out.print('*');
        System.out.println();
        System.out.println("*****Ejercicio 20 terminado*****");
    }


    public static void ejercicio21(Scanner sc) {
        System.out.println("*****Ejercicio 21*****");
        /* Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda
         * estas pueden ser dolares, yenes o libras. La función tendrá como parámetros:
         * La cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningun valór y mostrará un mensaje indicando el cambio. */
        float euros;
        float libras = 0.86f;
        float dolares = 1.28611f;
        float yenes = 129.852f;
        String cambio;
        NumberFormat cambioLibras = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat cambioDolares = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cambioYenes = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros = sc.nextFloat();
        cambio = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(euros);
        System.out.println("Convirtiendo " + cambio);
        System.out.println("Dolares: " + cambioDolares.format(euros * dolares));
        System.out.println("Libras: " + cambioLibras.format(euros * libras));
        System.out.println("Yenes: " + cambioYenes.format(euros * yenes));
        System.out.println("*****Ejercicio 21 terminado*****");
    }


    public static void ejercicio22() {
        System.out.println("*****Ejercicio 22*****");
        /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente. */
        int[] cienEnt = new int[100];
        llenarVectorOrdenado(cienEnt);
        System.out.println("Vector descendente: ");
        mostrarVectorDesc(cienEnt);
        System.out.println("*****Ejercicio 22 terminado*****");
    }


    public static void ejercicio23(Scanner sc) {
        System.out.println("*****Ejercicio 23*****");
        /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario un numero a buscar en el vector,
         * El programa mostrará donde se encuentra el numero y si se encuentra repetido. */
        int buscar, tama;
        System.out.println("Ingrese el tamaño de vector a utilizar");
        tama = sc.nextInt();
        int[] vectorRandom = new int[tama];
        llenarVectorRandom(vectorRandom, 100);
        mostrarVector(vectorRandom);
        System.out.println("Ingrese un numero a buscar en el vector");
        buscar = sc.nextInt();

        System.out.println(buscarNumEnArray(vectorRandom, buscar));
        System.out.println("*****Ejercicio 23 terminado*****");
    }


    public static void ejercicio24(Scanner sc) {
        System.out.println("*****Ejercicio 24*****");
        /* 24. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
        int tama;
        int unDigit = 0, dosDigit = 0, tresDigit = 0, cuatroDigit = 0, cincoDigit = 0;
        System.out.println("Ingrese el tamaño del vector");
        tama = sc.nextInt();
        int[] vector = new int[tama];
        llenarVectorRandom(vector, 100000);
        Arrays.sort(vector);
        mostrarVector(vector);
        for (int i : vector) {
            if (estaEntre(i, -9, 9)) {
                unDigit++;
            } else if (estaEntre(i, 10, 99)) {
                dosDigit++;
            } else if (estaEntre(i, 100, 999)) {
                tresDigit++;
            } else if (estaEntre(i, 1000, 9999)) {
                cuatroDigit++;
            } else if (estaEntre(i, 10000, 99999)) {
                cincoDigit++;
            }
        }
        System.out.printf("Numeros encontrados: \n" +
                "1 Digito: %d\n" +
                "2 Digitos: %d\n" +
                "3 Digitos: %d\n" +
                "4 Digitos: %d\n" +
                "5 Digitos: %d\n" +
                "\n", unDigit, dosDigit, tresDigit, cuatroDigit, cincoDigit);
        System.out.println("*****Ejercicio 24 terminado*****");
    }


    public static void ejercicio25() {
        System.out.println("*****Ejercicio 25*****");
        /* Realiza un programa que rellene una matriz de 4x4 de valores aleatorios y la muestre ordenada por sus columnas */
        int[][] matriz = new int[4][4];
        llenarMatrizRandom(matriz, 10);

        System.out.println("Matriz llena");
        mostrarMatriz(matriz);

        System.out.println("Matriz Ordenada");
        mostrarMatrizOrdenada(matriz);

        System.out.println("*****Ejercicio 25 terminado*****");
    }


    public static void ejercicio26() {
        System.out.println("*****Ejercicio 26*****");
        /* Realice un programa que compruebe si una matriz dada es antí simétrica. Una matriz A es anti-simétrica cuando
         * es igual a su propia traspuestas, pero camibada de signo. Es decir, A es anti simétrica si A = -A^t. La matríz traspuestas de una matriz A
         * se denota por A^t y se obtiene cambiando sus filas por columnas */
//        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matriz = new int[3][3];
        llenarMatrizConNegativo(matriz, 10);

        System.out.println("Matriz: ");
        mostrarMatriz(matriz);

        int[][] traspuesta = crearTraspuesta(matriz);

        System.out.println("Traspuesta: ");
        mostrarMatriz(traspuesta);

        System.out.println(antiSimetrica(matriz, traspuesta) ? "La matriz es anti-simetrica" : "La matriz NO es anti-simetrica");

        System.out.println("*****Ejercicio 26 terminado*****");
    }


    public static void ejercicio27() {
        System.out.println("*****Ejercicio 27*****");
        /* Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
         * El programa deberá comprobar que los números introducidos son correctos, es decir, entre 1 y 9
         * (recordar que una matriz magica tiene la suma de todas sus lineas al mismo valor)*/
        int[][] matrizMagica = new int[3][3];
        int suma = 0;
        llenarMatrizManual(matrizMagica, 1, 9);
        mostrarMatriz(matrizMagica);
        suma += matrizMagica[0][0] + matrizMagica[0][1] + matrizMagica[0][2];
        System.out.println(esMagica(matrizMagica) ? "La matriz ingresada es un cuadrado magico que suma: " + suma : "La matriz ingresada no es un cuadrado magico");
        System.out.println("*****Ejercicio 27 terminado*****");
    }


    public static void ejercicio28() {
        System.out.println("*****Ejercicio 28*****");
        /* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3, se solicita escribir un programa
         * en el cual se compruebe si la matriz P está contenida dentro de la matriz M.
         * Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en la matriz M, desplazandose por fila o columnas,
         * existe al menos una que coincida con la matriz P.
         * En ese caso, el programa debe indicar la fila y la columna de la matriz M en el cual empieza el primer elemento de la submatrizP*/
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        llenarMatrizRandom(matrizM, 100);
        mostrarMatriz(matrizM);
        llenarMatrizManual(matrizP, 0, 100);
        mostrarMatriz(matrizM);
        mostrarMatriz(matrizP);

        if (encontrarSubMatriz(matrizM, matrizP) == null) {
            System.out.println("La matriz M no contiene una submatriz que sea igual a la matriz P");
        } else {
            System.out.println("La matriz M contiene una submatriz igual a la matriz P en la ubicación: " + Arrays.toString(encontrarSubMatriz(matrizM, matrizP)));
        }

        System.out.println("*****Ejercicio 28 terminado*****");
    }


    public static void ejercicio1x(Scanner sc) {
        System.out.println("*****Ejercicio 1 Extra*****");
        /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 1600 minutos = 1 día, 2 horas */
        int premin, minutos, horas, dias;
        System.out.println("Ingrese la cantidad de minutos");
        premin = sc.nextInt();
        minutos = premin;
        dias = minutos / 1440;
        minutos = minutos % 1440;
        horas = minutos / 60;
        minutos = minutos % 60;
        System.out.println(premin + " minutos equivale a : ");
        System.out.println(dias + " dias, " + horas + " horas, " + minutos + " minutos.");
        System.out.println("*** **Ejercicio 1 Extra terminado*****");
    }


    public static void ejercicio2x() {
        System.out.println("*****Ejercicio 2 Extra*****");
        /* Declarar cuatro variables de tipo entero ABCD y asignarle un valor diferente a cada una.
         * A continuación, realizar las instrucciones necesarias para que:
         * B tome el valor de C
         * C tome el valor de A
         * A tome el valor de D
         * D tome el valor de B
         * Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar*/
        int A, B, C, D, aux;
        A = 1;
        B = 2;
        C = 3;
        D = 4;
        System.out.printf("A = %d, B = %d, C = %d, D = %d\n", A, B, C, D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.printf("A = %d, B = %d, C = %d, D = %d\n", A, B, C, D);
        System.out.println("*****Ejercicio 2 Extra terminado*****");
    }


    public static void ejercicio3x(Scanner sc) {
        System.out.println("*****Ejercicio 3 Extra*****");
        /* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
         * Caso contrario mostrar un mensaje. */
        String regex = "[aeiouAEIOU]";
        String input;
        System.out.println("Ingrese una letra");
        input = sc.nextLine().substring(0, 1);
        System.out.println("input= " + input);
        boolean esVocal = input.matches(regex);
        System.out.println(esVocal ? "La letra ingresada es una vocal" : "La letra ingresada no es una vocal");
        System.out.println("*****Ejercicio 3 Extra terminado*****");
    }


    public static void ejercicio4x(Scanner sc) {
        System.out.println("*****Ejercicio 4 Extra*****");
        /* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano. */
        int input;
        System.out.println("Ingrese un numero del 1 al 10");
        input = sc.nextInt();
        while (input < 1 || input > 10) {
            System.out.println("ERROR. INGRESE UN NUMERO DEL 1 AL 10");
            input = sc.nextInt();
        }
        switch (input) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("ERROR");
        }
        System.out.println("*****Ejercicio 4 Extra terminado*****");
    }


    public static void ejercicio5x(Scanner sc) {
        System.out.println("*****Ejercicio 5 Extra*****");
        /* Una obra social tiene tres clases de socios:
         * Los socios tipo 'A' abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
         * Los socios tipo 'B' abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
         * Los socios que menos aportan, los de tipo 'C', no reciben descuentos sobre dichos tratamientos.
         * Solicite una letra(carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento)
         * y determine el importe en efectivo a pagar por dicho socio.*/
        char tipoSocio;
        float costoTratamiento;
        System.out.println("Ingrese el tipo de socio: (A, B, C)");
        tipoSocio = sc.nextLine().toUpperCase().charAt(0);
        System.out.println("Ingrese el costo total del tratamiento:");
        costoTratamiento = sc.nextFloat();
        System.out.println(tipoSocio);
        if (tipoSocio == 'A') {
            costoTratamiento *= 0.5f;
        } else if (tipoSocio == 'B') {
            costoTratamiento *= 0.65f;
        } else if (tipoSocio == 'C') {
            System.out.println("No aplica descuento");
        }
        System.out.println("El cliente debe pagar: " + costoTratamiento);
        System.out.println("*****Ejercicio 5 Extra terminado*****");
    }


    public static void ejercicio6x(Scanner sc) {
        System.out.println("*****Ejercicio 6 Extra*****");
        /* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts y el promedio de estaturas en general */
        int personas;
        int personasMenorA160 = 0;
        double altura;
        double alturasTotal = 0;
        double alturasMenorA160 = 0;
        System.out.println("Ingrese la cantidad de personas a ingresar");
        personas = sc.nextInt();
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1));
            altura = sc.nextDouble();
            if (altura < 1.60) {
                personasMenorA160++;
                alturasMenorA160 += altura;
            }
            alturasTotal += altura;
        }
        System.out.println("Total personas: " + personas);
        System.out.println("Altura promedio total: " + alturasTotal / personas);
        System.out.println("Total personas menores a 1.60mts: " + personasMenorA160);
        System.out.println("Altura promedio menor a 1.60mts: " + alturasMenorA160 / personasMenorA160);
        System.out.println("*****Ejercicio 6 Extra terminado*****");
    }


    public static void ejercicio7x(Scanner sc) {
        System.out.println("*****Ejercicio 7 Extra*****");
        /* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
         * El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
         * Realice dos versiones del programa, una usando el bucle "while" y otra con el bucle "do-while".*/
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, suma = 0, cant, actual, cont = 0;
        double prom;
        System.out.println("Ingrese la cantidad de valores a ingresar");
        cant = sc.nextInt();
        while (cont != cant) {
            cont++;
            System.out.println("Ingrese el valor para " + cont);
            actual = sc.nextInt();
            max = Math.max(actual, max);
            min = Math.min(actual, min);
            suma += actual;
        } // con el do while es lo mismo porque el contador lo estoy agregando yo, no se por que lo pide de dos maneras
        prom = (float) suma / cant;
        System.out.println(MessageFormat.format("Cantidad de valores ingresados: {0}\nMaximo: {1}\nMinimo: {2}\nTotal: {3}\nPromedio: {4}", cant, max, min, suma, prom));
        System.out.println("*****Ejercicio 7 Extra terminado*****");
    }


    public static void ejercicio8x(Scanner sc) {
        System.out.println("*****Ejercicio 8 Extra*****");
        /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y
         * mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impartes.
         * Los numeros negativos no se suman. */
        int total = 0, totalPar = 0, totalImpar = 0, actual = 1, negativos = 0;
        while (actual % 5 != 0 || (actual % 5 == 0 && actual < 0)) {
            System.out.println("Ingrese un numero.");
            actual = sc.nextInt();
            if (actual > -1) {
                total++;
                totalPar = actual % 2 == 0 ? totalPar + 1 : totalPar;
                totalImpar = actual % 2 != 0 ? totalImpar + 1 : totalImpar;
            } else {
                System.out.println("Numero negativo detectado");
                negativos++;
            }
        }
        System.out.println("Multiplo de 5 detectado, terminando la lectura.");
        System.out.println(MessageFormat.format("Se han detectado {0} numeros validos\nDe esos numeros {1} son par\n{2} son impares\nSe ignoraron {3} numeros negativos ingresados", total, totalPar, totalImpar, negativos));
        System.out.println("*****Ejercicio 8 Extra terminado*****");
    }


    public static void ejercicio9x(Scanner sc) {
        System.out.println("*****Ejercicio 9 Extra*****");
        /* Simular la división usando solamente restas. Dados dos números enteros mayores que uno.
         * Realizar un algoritmo que calcule el cociente y el residuo usando solo restas.
         * Método: restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
         * este resultado es el residuo, y el número  de estas realizadas es el cociente */
        int dividendo, divisor, cociente = 0, resto, aux;

        System.out.println("Ingrese el dividendo");
        dividendo = sc.nextInt();
        aux = dividendo;
        System.out.println("Ingrese el divisor");
        divisor = sc.nextInt();

        while (aux > divisor) {
            cociente++;
            aux -= divisor;
        }
        resto = aux;
        System.out.println(dividendo + " / " + divisor + " = " + cociente);
        System.out.println("Resto = " + resto);
        System.out.println("*****Ejercicio 9 Extra terminado*****");
    }


    public static void ejercicio10x(Scanner sc) {
        System.out.println("*****Ejercicio 10 Extra*****");
        /* Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números
        generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si tu respuesta es o no correcta.
        En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.*/
        int num1 = (int) (Math.random() * 11), num2 = (int) (Math.random() * 11), resp = num1 * num2, input;
        System.out.println(num1 + " * " + num2);
        System.out.println("Adivinar la multiplicacion: ");
        input = sc.nextInt();

        while (input != resp) {
            System.out.println("Incorrecto, probar otra vez");
            input = sc.nextInt();
        }
        System.out.println("Correcto");

        System.out.println("*****Ejercicio 10 Extra terminado*****");
    }


    public static void ejercicio11x(Scanner sc) {
        System.out.println("*****Ejercicio 11 Extra*****");
        /* Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
         * Por ej, si introducimos 12345, el programa deberá devolver 5.*/
        long num, digitos = 0;
        System.out.println("Ingresar un numero");
        num = sc.nextLong();
        while (num > 0) {
            num = num / 10;
            digitos++;
        }
        System.out.println("Cantidad de digitos en el numero ingresado: " + digitos);
        System.out.println("*****Ejercicio 11 Extra terminado*****");
    }


    public static void ejercicio12x(Scanner sc) {
        System.out.println("*****Ejercicio 12 Extra*****");
        /* Crear un programa que dibuje una escalera de números, donde cada línea de números comience en 1 y termine en el número de la linea.
         * Solicitar la altura de la escalera al usuario al comenzar. */
        int num, aux = 0;
        System.out.println("Ingresar el numero para hacer escalera");
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            aux++;
            for (int j = 0; j < aux; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        System.out.println("*****Ejercicio 12 Extra terminado*****");
    }


    public static void ejercicio13x(Scanner sc) {
        System.out.println("*****Ejercicio 13 Extra*****");
        /* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
         * Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos
         * para averiguar la media de edad de los hijos de todas las familias*/
        int[][] familias;
        int aux;

        System.out.println("Ingrese la cantidad de familias a examinar");
        aux = sc.nextInt();
        familias = new int[aux][];

        for (int i = 0; i < familias.length; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + i);
            aux = sc.nextInt();
            familias[i] = new int[aux];
            aux = 0;
            for (int j = 0; j < familias[i].length; j++) {
                System.out.println("Ingrese la edad del hijo " + j + " de la familia " + i);
                familias[i][j] = sc.nextInt();
                aux += familias[i][j];
            }
            System.out.println("La media de las edades de la familia " + i + " es: " + aux/familias[i].length);
        }
        mostrarMatriz(familias);
        System.out.println("*****Ejercicio 13 Extra terminado*****");
    }


    public static void ejercicio14x(Scanner sc) {
        System.out.println("*****Ejercicio 14 Extra*****");
        /* Crear una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
        * La aplicación debe tener una función para cada operación matematica y debe devolverlas en el main */
        int num1, num2, option;
        System.out.println("Ingrese 2 numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Ingrese la siguiente opcion:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println(MessageFormat.format("{0} + {1} = {2}", num1, num2, sumar(num1, num2)));
                break;
            case 2:
                System.out.println(MessageFormat.format("{0} - {1} = {2}", num1, num2, restar(num1, num2)));
                break;
            case 3:
                System.out.println(MessageFormat.format("{0} * {1} = {2}", num1, num2, multiplicar(num1, num2)));
                break;
            case 4:
                System.out.println(dividir(num1, num2) == -1? "No se puede dividir por cero" : MessageFormat.format("{0} / {1} = {2}", num1, num2, dividir(num1, num2)));
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        System.out.println("*****Ejercicio 14 Extra terminado*****");
    }


    public static void ejercicio15x(Scanner sc) {
        System.out.println("*****Ejercicio 15 Extra*****");
        /* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
        por teclado e indique si son mayores o menores de edad. Despues de cada persona, el programa debe preguntarle al
         usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese "No"*/
        int cantPersonas, edad;
        String seguir;

        System.out.println("Ingrese la cantidad de personas a revisar");
        cantPersonas = sc.nextInt();

        for (int i = 0; i < cantPersonas; i++) {
            System.out.println("Ingrese la edad de la persona " + (i+1));
            edad = sc.nextInt();
            sc.nextLine();
            System.out.println(edad > 17? "La persona es mayor de edad" : "La persona es menor de edad");

            System.out.println("Desea seguir mostrando personas? (Si/No)");
            seguir = sc.nextLine();
            while(!seguir.equalsIgnoreCase("si") && !seguir.equalsIgnoreCase("no")){
                System.out.println("Error, ingrese una opcion valida");
                System.out.println("Desea seguir mostrando personas? (Si/No)");
                seguir = sc.nextLine();
            }

            if(seguir.equalsIgnoreCase("no")){
               break;
            }
        }
        System.out.println("*****Ejercicio 15 Extra terminado*****");
    }


    public static void ejercicio16x(Scanner sc) {
        System.out.println("*****Ejercicio 16 Extra*****");
        /* Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parametro
        * para que nos indique si es o no un número primo, debe devolver true si es primo, sino false */
        int input;

        System.out.println("Ingrese un numero");
        input = sc.nextInt();
        while(input < 1 ){
            System.out.println("ERROR. Ingrese un numero valido mayor o igual a 1");
            input = sc.nextInt();
        }
        System.out.println(esPrimo(input)? "El numero ingresado es primo" : "El numero ingresado NO es primo");
        System.out.println("*****Ejercicio 16 Extra terminado*****");
    }


    public static void ejercicio17x(Scanner sc) {
        System.out.println("*****Ejercicio 17 Extra*****");
        /* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
        con los valores ingreasor por el usuario. */
        int tamanio;

        System.out.println("Ingrese el tamaño del vector a utilizar");
        tamanio = sc.nextInt();
        int[] vector = new int[tamanio];

        llenarVectorRandom(vector, 10);
        mostrarVector(vector);

        System.out.println("La suma de los elementos del vector es: " + sumarVector(vector));
        System.out.println("*****Ejercicio 17 Extra terminado*****");
    }


    public static void ejercicio18x(Scanner sc) {
        System.out.println("*****Ejercicio 18 Extra*****");
        /* Escriba un programa que averigüe si dos vectores de N enteros soniguales
        * (la comparacion debera detenerse en cuanto se detecte alguna diferencia entre los elementos) */
        boolean iguales = true;
        int tamanio;
        System.out.println("Ingrese el tamaño de vectores a utilizar");
        tamanio = sc.nextInt();

        int[] vector1 = new int[tamanio];
        int[] vector2 = new int[tamanio];

        llenarVectorRandom(vector1, 10);
        mostrarVector(vector1);
        llenarVectorManual(vector2);

        System.out.println("Vector 1");
        mostrarVector(vector1);
        System.out.println("Vector 2");
        mostrarVector(vector2);

        for (int i = 0; i < vector1.length; i++) {
            if(vector1[i] != vector2[i]){
                System.out.println("Los vectores dejaron de ser iguales en la ubicacion: " + i);
                iguales = false;
                break;
            }
        }

        if(iguales) System.out.println("Los vectores son iguales");

        System.out.println("*****Ejercicio 18 Extra terminado*****");
    }


    public static void ejercicio19x() {
        System.out.println("*****Ejercicio 19 Extra*****");
        /* Crear una funcion que rellene un vector con números aleatorios, pasandole un arreglo por parametro.
        * Despues haremos otra funcion o procedimiento que imprima el vector */
        int[] yaTenia = new int[5];

        llenarVectorRandom(yaTenia, 10);
        mostrarVector(yaTenia);
        System.out.println("Ya tenia ambos hecho");
        System.out.println("*****Ejercicio 19 Extra terminado*****");
    }


    public static void ejercicio20x(Scanner sc) {
        System.out.println("*****Ejercicio 20 Extra*****");
        /* Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por
        * sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
        * Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por TPs y 2 por parciales.
        * Las ponderaciones de cada nota son:
        * Primer TP 10%, Segundo TP 15% , Primer Integrador  25%, Segundo Integrador 50%
        * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
        * Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados
        * Se aprueba obteniendo un promedio mayor o igual a 7*/
        final int cantAlumnos = 10, cantPruebas = 5, primerTP= 0, segundoTP = 1, primerIntegrador = 2, segundoIntegrador = 3, promedio = 4;
        int aprobados = 0, desaprobados = 0;
        Map<Integer, double[]> alumnos = new HashMap<Integer, double[]>();
        for (int i = 0; i < cantAlumnos; i++) {
            double[] notas = new double[cantPruebas];
            double finalPromedio = 0;
            System.out.println("Ingresando las notas del alumno: " + (i+1));
            for (int j = 0; j < cantPruebas; j++) {
                switch (j){
                    case primerTP:
                        System.out.println("Ingrese la nota del Primer trabajo práctico evaluativo");
                        notas[j] =  sc.nextDouble();
                        finalPromedio += notas[j]*0.1;
                        break;
                    case segundoTP:
                        System.out.println("Ingrese la nota del Segundo trabajo práctivo evaluativo");
                        notas[j] = sc.nextDouble();
                        finalPromedio += notas[j]*0.15;
                        break;
                    case primerIntegrador:
                        System.out.println("Ingrese la nota del Primer Integrador");
                        notas[j] = sc.nextDouble();
                        finalPromedio += notas[j]*0.25;
                        break;
                    case segundoIntegrador:
                        System.out.println("Ingrese la nota del Segundo Integrador");
                        notas[j] = sc.nextDouble();
                        finalPromedio += notas[j]*0.5;
                        break;
                    case promedio:
                        notas[j] = finalPromedio;
                        System.out.println("El promedio del alumno " + i + " es " + finalPromedio);
                        if (finalPromedio >= 7) {
                            aprobados++;
                        } else {
                            desaprobados++;
                        }
                }
            }
            alumnos.put(i, notas);
        }
        alumnos.forEach((key, value) -> System.out.println(key + " " + Arrays.toString(value)));

        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos desaprobados: " + desaprobados);

        System.out.println("*****Ejercicio 20 Extra terminado*****");
    }


    public static void ejercicio21x() {
        System.out.println("*****Ejercicio 21 Extra*****");
        /* Realizar un programa que rellene una matriz de tamaño de NxM con valores aleatorios y muestre la suma de sus elementos */
        int[][] matriz = new int[5][7];
        llenarMatrizRandom(matriz, 10);
        mostrarMatriz(matriz);
        System.out.println("La suma de los elementos de la matriz es: " + sumarMatriz(matriz));
        System.out.println("*****Ejercicio 21 Extra terminado*****");
    }


    public static void ejercicio22x() {
        System.out.println("*****Ejercicio 22 Extra*****");
        /*
        * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
        * a medida que el usuario las va ingresando, construya una “sopa de letras para niños”
        * de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila
        * que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        * rellene los espacios no utilizados con un número aleatorio del 0 al 9.
        * Finalmente imprima por pantalla la sopa de letras creada.
        * */
        System.out.println("Este es el ejercicio de la sopa de letras, lo hicimos con unos compañeros pero no guarde el codigo");
        System.out.println("*****Ejercicio 22 Extra terminado*****");
    }


    public static void ejercicio23x(Scanner sc) {
        System.out.println("*****Ejercicio 23 Extra*****");
        /*Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
        Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
        1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        Donde cada uno de los números se calcula sumando los dos anteriores a él.
        Por ejemplo: La sucesión del número 2 se calcula sumando (1+1)
        Análogamente, la sucesión del número 3 es (1+2), Y la del 5 es (2+3),Y así sucesivamente...
        La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
        Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para to do n>1
        Fibonaccin = 1 para to do n<=1
        Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
        como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.*/
        System.out.println("Esta es la secuencia de fibonacci, tengo la version de pseint");
        System.out.println(fibonacci(sc.nextInt()));
        System.out.println("*****Ejercicio 23 Extra terminado*****");
    }

}
