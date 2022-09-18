import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = (Queue<Person>) generateClients();

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.name + " " + person.surname + " прокатился на аттракционе.");
            person.spendTicket();
            if (person.tickets > 0) {
                queue.offer(person);
            }
        }
    }



    public static List<Person> generateClients() {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Лари", "Шварц", 10));
        persons.add(new Person("Мери", "Иствуд", 6));
        persons.add(new Person("Валя", "Иванова", 20));
        return persons;
    }


}
