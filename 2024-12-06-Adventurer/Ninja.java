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
    this.stealthMax = stealth;
  }

  public String getSpecialName() {
    return "stealth";
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
    return getName() + " attacks " + other.getName() + ". " + other.getName() + " lost 10 HP!";
  }

  public String support(Adventurer other) {
    int original = other.getHP();
    int max = other.getmaxHP();

    if (original+10 > max) {
      other.setHP(max);
      return getName() + " buffed " + other.getName() + " by " + (max-original) + " HP. Max HP of " + max + " reached!";
    }
    other.setHP(original+10);
    return getName() + " buffed " + other.getName() + " by 10 HP to " + (original+10) + " HP.";
  }

  public String support() {
    int original = getHP();
    int max = getmaxHP();

    if (original + 10 > max) {
      setHP(max);
      return getName() + " buffed by " + (original - max) + " HP. Max health reached!";
    }
    setHP(original + 10);
    return getName() + " buffed by 10 HP to " + (original + 10) + " HP.";
  }

  public String specialAttack(Adventurer other) {
    int currentSpecial = getSpecial();

    if (currentSpecial >= 10) {
      setSpecial(currentSpecial - 10);
      other.applyDamage(50);
      return getName() + " used 10 " + getSpecialName() + " pts to special attack " + other.getName() + ". " + other.getName() + " lost 50 HP!";
    }

    return "Not enough " + getSpecialName() + " points";
  }

}
