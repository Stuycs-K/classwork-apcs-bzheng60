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
            while (input.hasNextLine()) {
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

    public static void main(String[] args) {
        System.out.println(countTrianglesA("inputTri.txt"));
    }
}
