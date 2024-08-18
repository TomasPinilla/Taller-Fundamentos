import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Clase principal para manejar la entrada, llamar al método Resultado.angryProfessor y escribir la salida.
 */
public class Solucion {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int t = Integer.parseInt(bufferedReader.readLine().trim());

            for (int i = 0; i < t; i++) {
                String[] primerLinea = bufferedReader.readLine().trim().split(" ");
                int n = Integer.parseInt(primerLinea[0]);
                int k = Integer.parseInt(primerLinea[1]);

                List<Integer> llegada = Stream.of(bufferedReader.readLine().trim().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

                String resultado = Resultado.angryProfessor(k, llegada);
                bufferedWriter.write(resultado);
                bufferedWriter.newLine();
            }
        }
    }
}