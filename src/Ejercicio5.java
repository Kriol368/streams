import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();
        int actual;
        do {
            actual = scanner.nextInt();
            if (actual >= 0){
                valores.add(actual);
            }else{
                break;
            }
        }while (true);

        long cuantos = valores.stream()
                        .filter(valor -> valor >= 0 && valor <= 5)
                                .count();
        System.out.println(cuantos);
    }
}
