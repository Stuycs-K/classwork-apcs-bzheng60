import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class POne {
  public static int solve(String input) {
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

      int[][] visited = new int[10000][10000]; // part 2

      for (int i = 0; i < contents.length; i++) {
        String instruction = contents[i];
        char direction = instruction.charAt(0);
        int distance = Integer.parseInt(instruction.substring(1));
        
        if (direction == 'L') {
          if (facing.equals("North")) {
            for (int j = 0; j < distance; j++) {
              x--;
              visited[x+1000][y+1000]++;
              if (visited[x+1000][y+1000] == 2) {
                return Math.abs(x)+Math.abs(y);
              }
            }  
          }
          else if (facing.equals("East")) {
            for (int j = 0; j < distance; j++) {
              y++;
              visited[x+1000][y+1000]++;
              if (visited[x+1000][y+1000] == 2) {
                return Math.abs(x)+Math.abs(y);
              }
            }
          }
          else if (facing.equals("South")) {
            for (int j = 0; j < distance; j++) {
              x++;
              visited[x+1000][y+1000]++;
              if (visited[x+1000][y+1000] == 2) {
                return Math.abs(x)+Math.abs(y);
              }
            }
          }
          else {
            for (int j = 0; j < distance; j++) {
              y--;
              visited[x+1000][y+1000]++;
              if (visited[x+1000][y+1000] == 2) {
                return Math.abs(x)+Math.abs(y);
              }
            }
          }
          index = (index + 3) % 4;
        }
        else {
          if (facing.equals("North")) {
            for (int j = 0; j < distance; j++) {
              x++;
              visited[x+1000][y+1000]++;
              if (visited[x+1000][y+1000] == 2) {
                return Math.abs(x)+Math.abs(y);
              }
            }
          }
          else if (facing.equals("East")) {
            for (int j = 0; j < distance; j++) {
              y--;
              visited[x+1000][y+1000]++;
              if (visited[x+1000][y+1000] == 2) {
                return Math.abs(x)+Math.abs(y);
              }
            }
          }
          else if (facing.equals("South")) {
            for (int j = 0; j < distance; j++) {
              x--;
              visited[x+1000][y+1000]++;
              if (visited[x+1000][y+1000] == 2) {
                return Math.abs(x)+Math.abs(y);
              }
            }  
          }
          else {
            for (int j = 0; j < distance; j++) {
              y++;
              visited[x+1000][y+1000]++;
              if (visited[x+1000][y+1000] == 2) {
                return Math.abs(x)+Math.abs(y);
              }
            }
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
    System.out.println(solve("input.txt"));
  }
}
