import java.util.ArrayList;
import java.util.List;

public class SumaPositivosNegativos {


    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(-4);
        numeros.add(43);
        numeros.add(1);
        numeros.add(-33);
        numeros.add(9);

        long positivos = numeros.stream()
                .filter(numero -> numero > 0)
                .count();
        long negativos = numeros.stream()
                .filter(numero -> numero < 0)
                .count();
        System.out.println("Los positivos son " + positivos + " y los negativos son " + negativos);

    }
}
