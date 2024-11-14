import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String> createRandomArray (int size) {
    ArrayList<String> randomStrings = new ArrayList<String> (size);
    for (int i = 0; i < size; i++) {
      String str = "";
      int rando = (int) (Math.random() * 11);
      if (rando != 0) {
        str += rando;
      }
      randomStrings.add(str);
    }
    return randomStrings;
  }

  public static void replaceEmpty(AraryList<String> original) {
    index = original.indexOf("");
    while (index != -1) {
      original.set
      index = original.indexOf("");
    }
  }

  public static void main(String[] args) {
    ArrayList<String> randoms = createRandomArray(10);
    for (int i = 0; i < 10; i++) {
      System.out.println(randoms.get(i));
    }
  }


}
