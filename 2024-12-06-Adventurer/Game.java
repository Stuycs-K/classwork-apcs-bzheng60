import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    CodeWarrior c  = new CodeWarrior("Carmen", 100, "c++");
    Ninja n = new Ninja("Night", 100, 50);

    while(true) {
      System.out.println(c.getName() + ", " + c.getHP() + "/" + c.getmaxHP() + " HP, " + c.getSpecial() + "/" + c.getSpecialMax() + " " + c.getSpecialName());
      System.out.println(n.getName() + ", " + n.getHP() + "/" + n.getmaxHP() + " HP, " + n.getSpecial() + "/" + n.getSpecialMax() + " " + n.getSpecialName());

      Scanner input = new Scanner(System.in);
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / (q)uit");
      String action = input.nextLine();

      if (action.equals("a")) {
        c.attack(n);
      }
      else if (action.equals("sp")) {
        c.specialAttack(n);
      }
      else if (action.equals("su")) {
        c.support();
      }
      else if (action.equals("q")) {
        System.out.println("Thanks for playing!");
        return;
      }
      else {
        System.out.println("Invaid input. Try again");
      }

      if (n.getHP() > 0) {
        int choice = (int) (Math.random() * 4);
        if (choice == 0) {
          n.attack()
        }
      }

    }
  }
}
