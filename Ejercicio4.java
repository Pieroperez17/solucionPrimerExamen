
// Ejercicios del examen De EDA 1
// Nombre: Piero Perez Garcia


public class Ejercicio4 {
    public static void main(String[] args) {

        String[] Entrada2 = {"r", "x", "f", "f", "v", "v", "r"};
        ejercicio4(Entrada2);
    }

    public static void ejercicio4(String[] array) {
        boolean[] contado = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (!contado[i]) { 
                int contador = 1; 
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        contador++;
                        contado[j] = true;
                    }
                }
                System.out.println(array[i] + " aparece " + contador + " veces");
            }
        }
    }
}