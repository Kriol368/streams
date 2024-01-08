import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "Alvarez", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);

        long count = personas.stream()
                .filter(person -> person.getLastName().charAt(0) == 'A')
                .count();
        System.out.println("Numero de personas que su apellido comienza por A: " + count);

    }
}
