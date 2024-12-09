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
      
      boolean correctInput = true;

      if (action.equals("a")) {
        System.out.println(c.attack(n));
      }
      else if (action.equals("sp")) {
        System.out.println(c.specialAttack(n));
      }
      else if (action.equals("su")) {
        System.out.println(c.support());
      }
      else if (action.equals("q")) {
        System.out.println("Thanks for playing!");
        input.close();
        return;
      }
      else {
        correctInput = false;
        System.out.println("Invaid input. Try again");
      }

      if (correctInput) {
        if (n.getHP() > 0 && correctInput) {
          int choice = (int) (Math.random() * 3);
          if (choice == 0) {
            System.out.println(n.attack(c));
          }
          else if (choice == 1) {
            System.out.println(n.specialAttack(c));
          }
          else {
            System.out.println(n.support());
          }
        }

        if (n.getHP() <= 0) {
          System.out.println(c.getName() + " won!");
          input.close();
          return;
        }
        if (c.getHP() <= 0) {
          System.out.println(n.getName() + " won!");
          input.close();
          return;
        }
      }
    }
  }
}
