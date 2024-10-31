import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc1 = new Scanner("This is a bunch of words");

      double sum = 0;
      Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");

      while(sc1.hasNext()){
        System.out.println(sc1.next());
      }

      while(sc2.hasNext()) {
        sum += sc2.nextDouble();
      }
      System.out.println(sum);
    }
  }