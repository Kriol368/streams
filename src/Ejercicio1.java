import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);

        long count = personas.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println("Numero personas nacidas antes de 1970: " + count); //El resultado es 2


    }
}
