import java.util.List;

/**
 * Clase que contiene el método angryProfessor.
 */
public class Resultado {

    /**
     * Determina si la clase se cancela en función de los tiempos de llegada de los estudiantes.
     *
     * @param umbral Número mínimo de estudiantes que deben llegar a tiempo
     * @param llegada Lista de tiempos de llegada de los estudiantes
     * @return "SÍ" si la clase no se cancela, "NO" en caso contrario
     */
    public static String angryProfessor(int umbral, List<Integer> llegada) {
        int conteoLlegadasATiempo = 0;

        // Contar los estudiantes que llegaron a tiempo
        for (int tiempoDeLlegada : llegada) {
            if (tiempoDeLlegada <= 0) {
                conteoLlegadasATiempo++;
            }
        }

        // Determinar si la clase está cancelada
        if (conteoLlegadasATiempo < umbral) {
            return "NO";
        } else {
            return "SÍ";
        }
    }
}