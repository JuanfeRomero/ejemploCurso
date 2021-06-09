package Guia1;

import java.util.*;

public class Utils {

    public static void llenarVectorRandom(int[] vector, int limite) {
        Random aleatorio = new Random();
        for(int i = 0; i < vector.length; i++){
            vector[i] = aleatorio.nextInt(limite+1);
        }
    }

    public static void llenarVectorOrdenado(int[] vector) {
        for(int i = 0; i < vector.length; i++){
            vector[i] = i;
        }
    }

    public static void llenarVectorManual(int[] vector){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < vector.length; i++){
            System.out.println("Ingrese el valor del elemento: " + i);
            vector[i] = sc.nextInt();
        }
    }

    public static void mostrarVector(int[] vector){
        System.out.println(Arrays.toString(vector));
    }

    public static void mostrarVectorDesc(int[] vector){ // para el ejercicio 22
        for (int i = 0; i < vector.length / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(vector));

    }

    public static int sumarVector(int[] vector) {
        int suma = 0;
        for (int i: vector
             ) {
            suma += i;
        }
        return suma;
    }

    public static String buscarNumEnArray(int[] vector, int num){
        int counter = 0;
        String result = "";
        for(int i = 0; i < vector.length; i++){
            if(vector[i] == num){
                result = result.concat(" " + i + ",");
                counter++;
            }
        }
        if(counter == 0){
            return "No se ha encontrado el numero indicado en el array";
        }else if(counter == 1){
            return "Array encontrado en la siguiente ubicacion: " + result.substring(0, result.length()-1);
        }else{
            return "Array encontrado en las siguientes ubicaciones: " + result.substring(0, result.length()-1);
        }
    }

    public static boolean estaEntre(int num, int bajo, int alto){
        return bajo <= num && num <= alto;
    }

    public static void llenarMatrizRandom(int[][] matriz, int limite){
        Random aleatorio = new Random();
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio.nextInt(limite+1);
            }
        }
    }

    public static void llenarMatrizManual(int[][] matriz, int min, int max){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese un numero para la ubicacion " + i + ", " + j);
                matriz[i][j] = sc.nextInt();
                while(matriz[i][j] < min || matriz[i][j] > max){
                    System.out.println("ERROR, ingrese un numero en el rango valido (" + min + "-" + max + ")");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
    }

    public static void llenarMatrizConNegativo(int[][] matriz, int limite){
        Random aleatorio = new Random();
        int nega = aleatorio.nextInt(2);
        int random;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                random = nega == 0 ? aleatorio.nextInt(limite+1) : aleatorio.nextInt(limite+1)*-1;
                nega = aleatorio.nextInt(2);
                matriz[i][j] = random;
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz){
        for (int[] ints : matriz) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public static void mostrarMatrizOrdenada(int[][] matriz){
        for (int[] ints : matriz) {
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int sumarMatriz(int[][] matriz){
        int suma = 0;
        for (int[] i: matriz) {
            for (int j: i) {
                suma += j;
            }
        }
        return suma;
    }

    public static int[][] crearTraspuesta(int[][] matriz){
        int[][] traspuesta = new int[matriz.length][matriz.length];
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }
    public static boolean antiSimetrica(int[][] matriz, int[][] traspuesta){
        boolean anti = true;
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                anti = matriz[i][j] == traspuesta[i][j]*-1;
                if(!anti){
                    break;
                }
            }
        }
        return anti;
    }

    public static boolean esMagica(int[][] matriz){
        boolean magia = false;
        int[] horizontal = {0, 0, 0};
        int[] vertical = {0, 0, 0};
        int diagonal = 0;
        int invertCheckI = 0;
        int invertCheckJ = matriz.length-1;
        int inversa = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j= 0; j < matriz[i].length; j++){
                if(j == i){
                    diagonal += matriz[i][j];
                }
                if(i == invertCheckI && j== invertCheckJ){
                    inversa += matriz[i][j];
                    invertCheckI++;
                    invertCheckJ--;
                }
                horizontal[i] += matriz[i][j];
                vertical[j] += matriz[i][j];
            }
        }
        int checker = horizontal[0];
        if(checker == diagonal && checker == inversa && Arrays.stream(horizontal).distinct().count() == 1 && Arrays.stream(vertical).distinct().count() == 1){
            magia = true;
        }
        System.out.printf("Sumas de la matriz:\n" +
                "Horizontal: %s\n" +
                "Vertical: %s\n" +
                "Diagonal: %d\n" +
                "Inversa: %d\n", Arrays.toString(horizontal), Arrays.toString(vertical), diagonal, inversa);
        return magia;
    }

    public static int[] encontrarSubMatriz(int[][]matrizG, int[][]matrizP){
        int counter = 0;
        int[][] subMatriz = new int[3][3];
        for (int i=0; i < matrizG.length-2; i++){
            for(int j=0; j < matrizG[i].length-2; j++){
                if(matrizG[i][j] == matrizP[0][0]){
                    for(int k = 0; k < matrizP.length; k++){
                        System.arraycopy(matrizG[i + k], j, subMatriz[k], 0, matrizP.length);
                        if(Arrays.equals(subMatriz[k], matrizP[k])){
                            counter++;
                        }else{
                            counter = 0;
                            break;
                        }
                    }
                }
                if (counter == 3){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static int sumar(int num1, int num2){
        return num1+num2;
    }
    public static int restar(int num1, int num2){
        return num1-num2;
    }
    public static int multiplicar(int num1, int num2){
        return num1*num2;
    }
    public static double dividir(int num1, int num2){
        return num2==0? -1: (double)num1/num2;
    }

    public static boolean esPrimo(int num){
        boolean primo = true;
        if(num <= 3 || num == 5){
            return true;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

    public static int fibonacci(Integer n){
        int suma = 1;
        if(n <= 1){
            return n;
        }else{
            suma = fibonacci(n-1) + fibonacci(n-2);
        }
        return suma;
    }
}