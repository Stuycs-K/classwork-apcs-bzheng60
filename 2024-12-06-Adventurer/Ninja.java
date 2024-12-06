public class Ninja extends Adventurer {
  private int stealth, stealthMax;

  public Ninja(String name) {
    super(name);
  }

  public Ninja(String name, int hp) {
    super(name, hp);
  }

  public Ninja(String name, int hp, int stealth) {
    super(name, hp);
    this.stealth = stealth;
  }

  public String getSpecialName() {
    return "stealth"
  }

  public int getSpecial() {
    return stealth;
  }

  public void setSpecial(int n) {
    stealth = n;
  }

  public int getSpecialMax() {
    return stealthMax;
  }




}
