public class Driver {
    public static void main(String[] args) {
        Adventurer a1 = new Ninja("chris", 100, 50);
        Adventurer a2 = new Ninja("Bob", 100, 500);
        System.out.println(a1.attack(a2));
        System.out.println(a2.specialAttack(a1));
        System.out.println(a1.support());
    }
}
