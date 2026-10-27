import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;
/**
 * Author Ismael Alejandro Pauta Sotelo
 */
public class App {


    public static void main(String[] args) throws Exception {
        runEjemplosPrimitivos();
        runEjemplosObjetos ();

        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        // Bubble Sort
        System.out.println("--Bubble--");
        System.out.print("Original: ");
        printArreglo(b);
        Bubble bubble = new Bubble();
        bubble.sort(b);
        System.out.print("Ordenado: ");
        printArreglo(b);

        // Selection Sort
        System.out.println("--Selection--");
        System.out.print("Original: ");
        printArreglo(c);
        Selection selection = new Selection();
        selection.sort(c);

        // Insertion Sort
        System.out.println("--Insertion--");
        InsertionSort insertion = new InsertionSort();
        System.out.print("Original: ");
        printArreglo(d);
        insertion.sort(d);
        System.out.print("Ordenado: ");
        printArreglo(d);

        runComparators();
        runComparatorObj();
        runComparatorsOb2();
        
    }

    private static  void runComparatorObj(){
        List<Integer> numeros = 
        new ArrayList<>(List.of(5, 6, 4, 1, 2, 3));

        //orden de menor a mayor
        numeros.sort(null);
        System.out.println("Metodo sort orden natural:\n" + numeros);

        //ordenar mayor a menor
        numeros.sort(Comparator.reverseOrder());
        System.out.println("Reverso:\n" + numeros);
        
    }

    private static void runComparatorsOb2(){
        Estudiante e1 = new Estudiante("Juan", 8);
        Estudiante[] estudiantes = {e1, 
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6)
        };
        Comparator<Estudiante> compNota = Comparator.comparingDouble(e -> e.getNota());
        Arrays.sort(estudiantes, compNota);
        System.out.println(Arrays.toString(estudiantes));

        List<Estudiante> estudiantesLista = new ArrayList<>(List.of(
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8)
        ));

        Comparator<Estudiante> compNotaLista = Comparator.comparingDouble(e -> e.getNota());
        estudiantesLista.sort(compNotaLista);
        System.out.println(estudiantesLista);
        
    }

    private static void runComparators(){
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

        System.out.println("Estudiantes ordenados por Nota");
        bubble.sortEstudiantesN(estudiantes);
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

        System.out.println("Estudiantes ordenados por Nombre");
        bubble.sortEstudiantesName(estudiantes);
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }    
}
