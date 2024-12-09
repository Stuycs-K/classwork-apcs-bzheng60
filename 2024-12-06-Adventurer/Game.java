public class Game {
  public static void main(String[] args) {
    CodeWarrior c  = new CodeWarrior("Carmen", 100, "c++");
    Ninja n = new Ninja("Night", 100, 50);

    while(true) {
      System.out.println(c.getName() + ", " + c.getHP() + "/" + c.getmaxHP() + " HP, " + c.getSpecial() + "/" + c.getSpecialMax() + " " + c.getSpecialName());
      System.out.println(n.getName() + ", " + n.getHP() + "/" + n.getmaxHP() + " HP, " + n.getSpecial() + "/" + n.getSpecialMax() + " " + n.getSpecialName());
    }
  }
}
