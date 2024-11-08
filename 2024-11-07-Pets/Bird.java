public class Bird extends Animal {
  private double height;
  private String color;


  public Bird(String noise, int age, String name, double height, String color){
    super(noise, age, name);
    this.height = height;
    this.color = color;
  }

  public void speak(){
    super.speak();
    System.out.println("My feathers are colored " + color);
    System.out.println("I am " + height + " inches tall");
  }

  public String getName(){
    return ("The Mighty " + super.getName());
  }

  //Step 8:In Driver.java answer: What is the difference before and after you override this method?
  //What does this tell us about methods that are overridden?
  //public String getName(){  }

  //Go back and complete steps 9 onwards.

}