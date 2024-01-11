import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personas = new ArrayList<>();
        String persona = " ";
        while (!persona.isEmpty()) {
            persona = scanner.nextLine();
            String[] actual = persona.split(" ");
            if (actual[0].isEmpty()){
                break;
            }
            Person personaActual = new Person(actual[0], actual[1], Integer.parseInt(actual[2]));
            personas.add(personaActual);
            int si = personaActual.getFirstName().compareTo("pepe");
            System.out.println(si);
        }

        personas.stream()
                .map(Person::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }


}
