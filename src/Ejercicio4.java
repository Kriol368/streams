import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        String actual = " ";
        while (!actual.isEmpty()){
            actual = scanner.nextLine();
            if (!actual.isEmpty()) {
                palabras.add(actual);
            }
        }

        String combined = palabras.stream()
                .reduce("", (previousString, palabra) -> previousString + palabra + " ");
        System.out.println(combined);
    }
}
