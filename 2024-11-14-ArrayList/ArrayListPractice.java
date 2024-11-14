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

  public static void replaceEmpty(ArrayList<String> original) {
    int index = original.indexOf("");
    while (index != -1) {
      original.set(index, "Empty");
      index = original.indexOf("");
    }
  }

  public static ArrayList<String> makeReverseList(ArrayList<String> original){
    ArrayList<String> reverse = new ArrayList<String>(original.size());
    for (int i = original.size()-1; i >= 0; i--){
      reverse.add(original.get(i));
    }
    return reverse;
  }

  public static void main(String[] args) {
    ArrayList<String> randoms = createRandomArray(10);
    System.out.println(randoms);

    replaceEmpty(randoms);
    System.out.println(randoms);
    
    ArrayList<String> reversed = makeReverseList(randoms);
    System.out.println(reversed);

  }


}
