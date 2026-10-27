/**
 * Author Ismael Alejandro Pauta Sotelo
 */
public class Selection {
    public void sort(int[] arreglo) {

        int comparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arreglo.length; j++) {

                comparaciones++;

                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            if (min != i) {
                // Guardamos los valores antes de intercambiarlos para mostrarlos en consola
                int valI = arreglo[i];
                int valMin = arreglo[min];

                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;

                cambios++;
                
                // Imprimimos la pasada con el formato exacto de la primera imagen
                System.out.println("Pasada= " + i + " | cambio " + valI + "<->" + valMin);
            }
        }

        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.print("Ordenado: ");
        imprimirArreglo(arreglo);
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
