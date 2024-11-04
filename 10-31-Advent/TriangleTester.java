import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
    public static boolean isValidTriangle(int a, int b , int c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public static int countTrianglesA(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int count = 0;
            while (input.hasNextInt()) {
                if (isValidTriangle(input.nextInt(), input.nextInt(), input.nextInt())) {
                    count++;
                }
            }
            input.close();
            return count;
        }
        catch (FileNotFoundException ex) {
          System.out.println("File not found");
          return -1;
        }
    }

    public static int countTrianglesB(String filename) {
        try {
            File file = new File (filename);
            Scanner input = new Scanner(file);
            int count = 0;
            int row = 0;
            int[][] arr = new int[3][3];
            while (input.hasNextInt()) {
                row %= 3;
                for (int j = 0; j < 3; j++) {
                    arr[row][j] = input.nextInt();
                }
                if (row == 2) {
                    if (isValidTriangle(arr[0][0], arr[1][0], arr[2][0])) {
                        count++;
                    }
                    
                    if (isValidTriangle(arr[0][1], arr[1][1], arr[2][1])) {
                        count++;
                    }
                    
                    if (isValidTriangle(arr[0][2], arr[1][2], arr[2][2])) {
                        count++;
                    }
                }
                row++;
            }
            input.close();
            return count;
        }
        catch (FileNotFoundException ex) {
          System.out.println("File not found");
          ex.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countTrianglesA("inputTri.txt"));
        System.out.println(countTrianglesB("inputTri.txt"));
    }
}
