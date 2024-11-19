import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class POne {
  public static int shortest(String input) {
    int x = 0;
    int y = 0;

    try {
      File file = new File(input);
      Scanner sc = new Scanner(file);
      String line = sc.nextLine();

      String[] contents = line.split(", ");

      String[] directions = new String[] {"North", "East", "South", "West"};
      String facing = "North";
      int index = 0;

      for (int i = 0; i < contents.length; i++) {
        String instruction = contents[i];
        char direction = instruction.charAt(0);
        int distance = Integer.parseInt(instruction.substring(1));
        
        if (direction == 'L') {
          if (facing.equals("North")) {
            x -= distance;
          }
          else if (facing.equals("East")) {
            y += distance;
          }
          else if (facing.equals("South")) {
            x += distance;
          }
          else {
            y -= distance;
          }
          index = (index + 3) % 4;
      }
      else {
        if (facing.equals("North")) {
          x += distance;
        }
        else if (facing.equals("East")) {
          y -= distance;
        }
        else if (facing.equals("South")) {
          x -= distance;
        }
        else {
          y += distance;
        }
        index = (index + 1) % 4;
      }
      facing = directions[index];
      sc.close();
      }
      return Math.abs(x)+Math.abs(y);
    }
    
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
    
  }
  public static void main(String[] args) {
    System.out.println(shortest("input.txt"));
  }
}
