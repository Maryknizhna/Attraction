public class Person {
    protected String name;
    protected String surname;
    protected int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public boolean spendTicket() {
        if (tickets > 0) {
            tickets--;
            return true;
        } else {
            return false;
        }
    }
}