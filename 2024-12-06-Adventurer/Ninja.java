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

  public String attack(Adventurer other) {
    other.applyDamage(10);
    return other.getName() + " lost 10 HP!";
  }

  public String support(Adventurer other) {

  }

  public String support() {
    if (getHP()+10 > getmaxHP()) {
      return "HP buffed by " + (getmaxHP() - getHP()) + "to. Max health reached!"
    }
    setHP(getHP() + 10);
    return
  }

  public String specialAttack(Adventurer other) {
    int currentSpecial = getSpecial();
    if (currentSpecial >= 10) {
      setSpecial(currentSpecial - 10);

    }
    else {
      System.out.println("not ")
    }
  }





}
