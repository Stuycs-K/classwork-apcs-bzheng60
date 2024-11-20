import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PTwo {
  public static void main(String[] args) {
    String pass = "";
    try {
        File file = new File("PTwo.txt");
        Scanner sc = new Scanner(file);

        // part 1
        // int[][] keypad = new int[][] {{1, 2, 3},
        //                               {4, 5, 6},
        //                               {7, 8, 9}};
        // int i = 1;
        // int j = 1;

        String[][] keypad = new String[][] {
            {"0", "0", "1", "0", "0"},
            {"0", "2", "3", "4", "0"},
            {"5", "6", "7", "8", "9"},
            {"0", "A", "B", "C", "0"},
            {"0", "0", "D", "0", "0"}
        };
        int i = 2;
        int j = 0;

        // int currNum=0;

        // Part 2
        String currString = "";

        while (sc.hasNext()) {
            String line = sc.nextLine();

            // Part 1
            // for (int index = 0; index < line.length(); index++) {
            //     if (line.charAt(index) == 'U') {
            //         if (i >= 1) {
            //             i--;
            //         }
            //     }
            //     else if (line.charAt(index) == 'D') {
            //         if (i <= 1) i++;
            //     }
            //     else if (line.charAt(index) == 'L') {
            //         if (j >= 1) j--;
            //     }
            //     else {
            //         if (j <= 1) j++;
            //     }
            //     currNum = keypad[i][j];
            // }
            // pass += (currNum + "");


            // Part 2
            for (int index = 0; index < line.length(); index++) {
                if (line.charAt(index) == 'U') {
                    if (i >= 1) {
                        if (!keypad[i-1][j].equals("0")) i--;
                    }
                }
                else if (line.charAt(index) == 'D') {
                     if (i <= 3) {
                        if (!keypad[i+1][j].equals("0")) i++;
                     }
                }
                else if (line.charAt(index) == 'L') {
                    if (j >= 1) {
                        if (!keypad[i][j-1].equals("0")) j--;
                    }
                }
                else {
                    if (j <= 3) {
                        if (!keypad[i][j+1].equals("0")) j++;
                    }
                }
                currString = keypad[i][j];
            }
            pass += currString;
        }
        sc.close();
    }
    catch (FileNotFoundException ex) {
        System.out.println("File not found");
    }
    System.out.println(pass);
    }
}

    