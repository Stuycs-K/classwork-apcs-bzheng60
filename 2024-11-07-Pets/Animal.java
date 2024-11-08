public class Animal {
  private String noise;
  private int age;
  private String name;

  public Animal(String noise, int age, String name){
    this.noise = noise;
    this.age = age;
    this.name = name;
  }

  public void speak(){
    System.out.println("My name is " + getName() + ".");
    System.out.println("I am " + age + " years old.");
    System.out.println("I say " + getNoise() + ".");
  }

  public String getName(){
    return name;
  }
  public String getNoise(){
    return noise;
  }
}

