/**
 * Author Ismael Alejandro Pauta Sotelo
 */
public class InsertionSort {
    public void sort(int[] arreglo) {
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;
            
            boolean huboCambio = false;
            
            while (j >= 0) {
                comparaciones++;
                if (arreglo[j] > key) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                    cambios++;
                    huboCambio = true;
                } else {
                    break;
                }
            }
            arreglo[j + 1] = key;

            if (huboCambio) {
                System.out.println("Pasada= " + (i - 1) + " | El aux = " + key + " se inserta en la pos " + (j + 1));
            }
        }

        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
    }
}