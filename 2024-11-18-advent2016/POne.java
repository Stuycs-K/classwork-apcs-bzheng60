import java.io.
import java.util.Scanner;

public class POne {
  public static shortest(String input) {
    int x = 0;
    int y = 0;

    File file = new File(input);
    Scanner sc = new Scanner(file)
    String line = sc.nextLine();

    String[] contents = line.split(", ");

    String[] directions = new String[] {"North", "East", "South", "West"};
    String facing = "North";


    String instruction = sc.next();
    String direction = instruction.charAt(0);
    int distance = Integer.parseInt(instrution.charAt(1));

    if (direction == 'L') {
      if (facing.equals("North")) {
        x -= distance;
      }
      if (facing.equals("East")) {
        y += distance;
      }
      if (facing.equals("South")) {
        x += distance;
      }
      else {
        y -= distance;
      }
      int index = (directions.indexOf(facing) + 3) % 4);
    }
    else {
      if (facing.equals("North")) {
        x += distance;
      }
      if (facing.equals("East")) {
        y -= distance;
      }
      if (facing.equals("South")) {
        x -= distance;
      }
      else {
        y += distance;
      }
      int index = (directions.indexOf(facing) + 1) % 4);
    }
    facing = directions[index];
    sc.close();
    return x+y;
  }
  public static void main(String[] args) {
    System.out.println(shortest("R2, R2, R2"));
  }
}
