import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Pruebas unitarias para la clase Resultado.
 */
public class ResultTest {

    @Test
    public void pruebaClaseNoCancelada() {
        List<Integer> llegada = Arrays.asList(-1, -3, 4, 2);
        assertEquals("SÍ", Resultado.angryProfessor(3, llegada));
    }

    @Test
    public void pruebaClaseCancelada() {
        List<Integer> llegada = Arrays.asList(0, -1, 2, 1);
        assertEquals("NO", Resultado.angryProfessor(2, llegada));
    }

    @Test
    public void pruebaCasoExtremoSinEstudiantesATiempo() {
        List<Integer> llegada = Arrays.asList(1, 2, 3, 4);
        assertEquals("NO", Resultado.angryProfessor(5, llegada));
    }

    @Test
    public void pruebaUmbralExacto() {
        List<Integer> llegada = Arrays.asList(-1, -1, 1, 1);
        assertEquals("SÍ", Resultado.angryProfessor(2, llegada));
    }

    @Test
    public void pruebaTodosEstudiantesATiempo() {
        List<Integer> llegada = Arrays.asList(-1, -1, -1, -1);
        assertEquals("SÍ", Resultado.angryProfessor(2, llegada));
    }
}
