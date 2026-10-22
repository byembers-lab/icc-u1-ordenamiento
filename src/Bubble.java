import models.Estudiante;

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

    public void sort(int[] b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}


