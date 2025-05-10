
// Ejercicios del examen De EDA 1
// Nombre: Piero Perez Garcia


public class Ejercicio3 {
    public static void main(String[] args) {
        Integer[] Entrada1 = {1, 2, 3, 4, 5};
        ejercicio3(Entrada1);
        
    }
    public static void ejercicio3(Integer[] array) {
        int numeros_pares = 0;
        int numeros_impares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numeros_pares++;
            } else {
                numeros_impares++;
            }
        }
        int resultado = numeros_pares - numeros_impares;
        System.out.println(resultado);
    }
    
}