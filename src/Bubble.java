import models.Estudiante;
/**
 * Author Ismael Alejandro Pauta Sotelo
 */
public class Bubble {
    public static void main(String[] args) {
        
    }

    public void sortEstudiantesN(Estudiante [] estudiantes){
        for (int i = 0; i < estudiantes.length-1 ; i++){
            boolean cambio = false;
            for (int j = 0; j < estudiantes.length-i-1 ; j++){
                if (estudiantes[j].getNota() > estudiantes[j+1].getNota()) {
                    //Intercambio
                    Estudiante aux = estudiantes[j];
                    estudiantes [j] = estudiantes [j+1];
                    estudiantes [j+1] = aux;
                    cambio = true;
                }
            }
            if (!cambio) {
                break;
            }
        } 
    }

    public void sortEstudiantesName(Estudiante [] estudiantes){
        for (int i = 0; i < estudiantes.length-1 ; i++){
            boolean cambio = false;
            for (int j = 0; j < estudiantes.length-i-1 ; j++){
                if (estudiantes[j].getName().compareTo(estudiantes[j+1].getName()) > 0) {
                    //Intercambio
                    Estudiante aux = estudiantes[j];
                    estudiantes [j] = estudiantes [j+1];
                    estudiantes [j+1] = aux;
                    cambio = true;
                }
            }
            if (!cambio) {
                break;
            }
        } 
    }

    public void sort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            boolean cambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambio = true;
                }
            }
            if (!cambio) break;
        }
    }
}


