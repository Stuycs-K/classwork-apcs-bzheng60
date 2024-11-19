import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PFour {
    public static char 
    public static void main(String[] args) {
    
        try {
            File file = new File("PFour.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] parts = line.split("-");
                
                String last = parts[parts.length - 1];
                int ID = Integer.parseInt(last.substring(0, 3));
                String checkSum = last.substring(4, last.length() - 1);

                int[] count = new int[26];
                
                for (int i = 0; i < parts.length - 1; i++) {
                    String item = parts[i];
                    for (int j = 0; j < item.length(); j++) {
                        int index = item.charAt(j) - 97;
                        count[index]++;
                    }
                }



            }   // array of count a, b, c, d, e, ....
            // left to right, remove max each loop (checkSum.length() loops)
            sc.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}

    