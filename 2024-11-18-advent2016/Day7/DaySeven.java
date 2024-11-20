import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DaySeven {
    public boolean isABBA(String input) {
        String firstTwo = input.substring(0,2);
        String lastTwoReversed = input.substring(2, 3) + input.substring(3);
        return firstTwo.equals(lastTwoReversed) && (input.charAt(1) != input.charAt(2));
    }
    public static void main(String[] args) {
    String pass = "";
    try {
        File file = new File("DaySeven.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            // find hypernet
            for (int i = 0; i < line.length(); i++) {
                
            }
        }
        sc.close();
    }
    catch (FileNotFoundException ex) {
        System.out.println("File not found");
    }
    System.out.println(pass);
    }
}

    