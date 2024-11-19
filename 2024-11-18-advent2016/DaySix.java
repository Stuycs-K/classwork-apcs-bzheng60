import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DaySix {
 
    public static void main(String[] args) {
        String corrected = "";

        String original = "";
    
        try {
            File file = new File("DaySix.txt");
            Scanner sc = new Scanner(file);

            ArrayList<String> messages = new ArrayList<String>();

            int length = 0;

            while (sc.hasNext()) {
                String line = sc.nextLine();
                messages.add(line);
                length = line.length();
            }
            
            for (int column = 0; column < length; column++) {
                
                int[] count = new int[26];
                for (int i = 0; i < messages.size(); i++) {
                    int index = messages.get(i).charAt(column) - 97;
                    count[index]++;
                }
                // part 1
                int maxCount = -1;
                int maxIndex = 0;


                for (int i = 0; i < 26; i++) {
                    if (maxCount < count[i]) {
                        maxCount = count[i];
                        maxIndex = i;
                    }
                    
                }
                char maxChar = Character.toString(maxIndex + 97).charAt(0);

                corrected += maxChar;
                
                // part 2
                int minCount = count[0];
                int minIndex = 0;

                for (int i = 0; i < 26; i++) {
                    if (minCount > count[i]) {
                        minCount = count[i];
                        minIndex = i;
                    } 
                }
                char minChar = Character.toString(minIndex + 97).charAt(0);
                original += minChar;
            }
            
            System.out.println(corrected);
            System.out.println(original);
            sc.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}

    