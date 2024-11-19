import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PTwo {
  public static void main(String[] args) {
    String pass = "";
    try {
        File file = new File("PTwo.txt");
        Scanner sc = new Scanner(file);

        int[][] keypad = new int[][] {{1, 2, 3},
                                      {4, 5, 6},
                                      {7, 8, 9}};
        int i = 1;
        int j = 1;

        int currNum=0;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            
            for (int index = 0; index < line.length(); index++) {
                if (line.charAt(index) == 'U') {
                    if (i >= 1) {
                        i--;
                    }
                }
                else if (line.charAt(index) == 'D') {
                    if (i <= 1) i++;
                }
                else if (line.charAt(index) == 'L') {
                    if (j >= 1) j--;
                }
                else {
                    if (j <= 1) j++;
                }
                currNum = keypad[i][j];
            }
            pass += (currNum + "");
        }
        sc.close();
    }
    catch (FileNotFoundException ex) {
        System.out.println("File not found");
    }
    System.out.println(pass);
    }
}

    