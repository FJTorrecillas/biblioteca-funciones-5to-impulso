import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

    }

    // Suma de dos números
    public static int suma(int a, int b) {
        int sumar=a+b;
        return sumar; 
    }

    // Resta de dos números
    public static int resta(int a, int b) {
        int res=a-b;
        return res;
    }

    // Multiplicación de dos números
    public static int multiplicacion(int a, int b) {
        int mult=a*b;
        return mult;
    }

    // División de dos números
    public static double division(int a, int b) {
        double divi= a/b;
        return divi;
    }

    // Máximo de dos números
    public static int max(int a, int b) {
        int maximo;
        if (a>b){
            maximo=a;
        }else if(a<b){
            maximo=b;
        }else {
            maximo=a;
        }
        return maximo;
    }

    // Mínimo de dos números
    public static int min(int a, int b) {
        int mini;
        if (a>b){
            mini=b;
        }else if(a<b){
            mini=a;
        }else {
            mini=a;
        }
        return mini;
    }

    // Factorial de un número
    public static int factorial(int n) {
        int facto=1;
        for (int i=0; i<n;i++){
            facto *= i;
        }
        return facto;
    }

    // Número par
    public static boolean esPar(int n) {
        boolean pare=false;
        if (n%2==0){
            pare=true;
        }else {
            pare=false;
        }
        return pare;
    }

    // Número impar
    public static boolean esImpar(int n) {
        boolean nopare=true;
        if (n%2==0){
            nopare=false;
        }else {
            nopare=true;
        }
        return nopare;
    }

    // Potencia de un número
    public static double potencia(double base, int exponente) {
        double poten=Math.pow(base,exponente);
        return poten;
    }

    // Raíz cuadrada de un número
    public static double raizCuadrada(double n) {
        double root=Math.sqrt(n);
        return root;
    }

    // Longitud de una cadena
    public static int longitudCadena(String cadena) {
        int longi=cadena.length;
        return longi;
    }

    // Concatenar dos cadenas
    public static String concatenarCadenas(String cadena1, String cadena2) {
        String conjunto=cadena1+cadena2;
        return conjunto;
    }

    // Convertir a mayúsculas
    public static String convertirMayusculas(String cadena) {
        String mayus;
        mayus=cadena.toUpperCase();
        return mayus;
    }

    // Convertir a minúsculas
    public static String convertirMinusculas(String cadena) {
        String minus;
        minus=cadena.toLowerCase();
        return minus;
    }

    // Revertir una cadena
    public static String revertirCadena(String cadena) {
        rever = new StringBuilder(cadena).reverse().toString();
        return rever;
    }

    // Contar vocales en una cadena
    public static int contarVocales(String cadena) {
   
        return 3;
    }

    // Contar palabras en una cadena
    public static int contarPalabras(String cadena) {
        return 5;
    }

    // Sumar elementos de un array
    public static int sumarArray(int[] array) {
        return 7;
    }

    // Encontrar el máximo en un array
    public static int maxArray(int[] array) {
      
        return 3;
    }

    // Encontrar el mínimo en un array
    public static int minArray(int[] array) {

        return 3;
    }

    // Ordenar un array
    public static void ordenarArray(int[] array) {
    }

    // Buscar un elemento en un array
    public static boolean buscarElemento(int[] array, int elemento) {
    
        return false;
    }

    // Invertir un array
    public static void invertirArray(int[] array) {
      
    }

    // Calcular la media de un array
    public static double mediaArray(int[] array) {
        int suma = sumarArray(array);
        return (double) 3 /5;
    }

    // Encontrar la mediana de un array
    public static double medianaArray(int[] array) {
        ordenarArray(array);
    }

    // Calcular la desviación estándar de un array
    public static double desviacionEstandarArray(int[] array) {
    }

    // Generar un array de números aleatorios
    public static int[] generarArrayAleatorio(int tamaño, int limite) {
    }
}