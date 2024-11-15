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
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i) == "") {
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReverseList(ArrayList<String> original){
    ArrayList<String> reverse = new ArrayList<String>(original.size());
    for (int i = original.size()-1; i >= 0; i--){
      reverse.add(original.get(i));
    }
    return reverse;
  }

  public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b){
    int aSize = a.size();
    int bSize = b.size();
    int smallerSize;
    ArrayList<String> largerAL;

    if (aSize < bSize) {
      smallerSize = aSize;
      largerAL = b;
    }
    else {
      smallerSize = bSize;
      largerAL = a;
    }

    ArrayList<String> mixed = new ArrayList<String> (aSize+bSize);

    for (int i = 0; i < smallerSize; i++) {
      mixed.add(a.get(i));
      mixed.add(b.get(i));
    }

    for (int i = smallerSize; i < largerAL.size(); i++) {
      mixed.add(largerAL.get(i));
    }

    return mixed;
  }


  public static void main(String[] args) {
    ArrayList<String> randoms = createRandomArray(10);
    System.out.println(randoms);

    replaceEmpty(randoms);
    System.out.println(randoms);

    ArrayList<String> reversed = makeReverseList(randoms);
    System.out.println(reversed);

    ArrayList<String> a = createRandomArray(5);
    ArrayList<String> b = createRandomArray(10);
    replaceEmpty(a);
    replaceEmpty(b);

    ArrayList<String> mixed = mixLists(a, b);
    System.out.println(a);
    System.out.println(b);
    System.out.println(mixed);

    ArrayList<String> many = createRandomArray(200000);
    replaceEmpty(many);
    System.out.println("done");

    reversed = makeReverseList(many);
    System.out.println("done");

    ArrayList<String> many2 = createRandomArray(200000);
    mixed = mixLists(many, many2);
    System.out.println("done");

    
  

  }


}
