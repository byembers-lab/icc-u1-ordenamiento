import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {


    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        runEjemplosObjetos ();

        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        // Bubble Sort
        System.out.println("Bubble");
        Bubble bubble = new Bubble();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        // Selection Sort
        System.out.println("Selection");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        // Insertion Sort
        System.out.println("Insertion");
        InsertionSort insertion = new InsertionSort();
        printArreglo(d);
        insertion.sort(d);
        printArreglo(d);

        System.out.println("Hello, World!");
    }

    private static void runComparator(){
        Integer [] original = {5, 6, 4, 1, 2, 3};
        //Array.sort -> ordena arreglos alfabeticamente por su orden natural
        Arrays.sort(original);
        for (int i = 0; i < original.length; i++){
            System.err.println(original[i]);
        }

        Arrays.sort(original, Comparator.reverseOrder());
    }

    public static void runEjemplosPrimitivos(){

    }

    private static void runEjemplosObjetos(){
        Estudiante e1 = new Estudiante("Juan", 10);
        Estudiante [] estudiantes = {e1, 
            new Estudiante("Juan", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8),
        };
        Bubble bubble = new Bubble();
    }


    public static void insertion(int[] a) {
        for (int i = 1 ; i < a.length; i++){
            int key = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j--; 
            }
            a[j + 1] = key;        }
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }


    
}
