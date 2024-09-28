public class MyArrays {
  public static String aryToString(int[] nums) {
    String ans = "[";
    for (int i = 0; i< nums.length; i++) {
      ans += nums[i];
      if (i < nums.length - 1) {
        ans += ", ";
      }
    }
    ans += "]";
    return ans;
  }

  public static int[] returnCopy(int[] ary) {
    int[] aryCopy = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      aryCopy[i] = ary[i];
    }
    return aryCopy;
  }

  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] concated = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      concated[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++) {
      concated[i+ary1.length] = ary2[i];
    }
    return concated;
  }

  public static void main(String[] args) {
    // aryToString test
    System.out.println("AryToString Test:");
    int[] ary = {1, 2, 3, 5, 6};
    System.out.println(aryToString(ary));

    // returnCopy test cases
    System.out.println("\nCopy Tests:\n");

    // Test 1
    ary = new int[10];
    String original = aryToString(ary);
    String copy = aryToString(returnCopy(ary));

    System.out.println("Original: " + original + "\nCopy: " + copy);
    System.out.println(copy.equals(original));

    // Test 2
    ary = new int[] {};
    original = aryToString(ary);
    copy = aryToString(returnCopy(ary));

    System.out.println("\nOriginal: " + original + "\nCopy: " + copy);
    System.out.println(copy.equals(original));

    // Test 3
    ary = new int[] {5, 2, 0, 10, 33, 56};
    original = aryToString(ary);
    copy = aryToString(returnCopy(ary));

    System.out.println("\nOriginal: " + original + "\nCopy: " + copy);
    System.out.println(copy.equals(original));


    // concatArray test cases
    System.out.println("\nConcat Tests:\n");
    // Test 1
    int[] ary1 = new int[] {1, 2, 3};
    int[] ary2 = new int[] {0, 3, 1, 7};

    String concated = aryToString(concatArray(ary1, ary2));
    System.out.println("Concated Array: " + concated);

    String expectedConcated = aryToString(new int[] {1, 2, 3, 0, 3, 1, 7});
    System.out.println("Expected Array: " + expectedConcated);

    System.out.println(concated.equals(expectedConcated));

    // Test 2
    ary1 = new int[] {4, 2, 7, 6};
    ary2 = new int[0];

    concated = aryToString(concatArray(ary1, ary2));
    System.out.println("\nConcated Array: " + concated);

    expectedConcated = aryToString(new int[] {4, 2, 7, 6});
    System.out.println("Expected Array: " + expectedConcated);

    System.out.println(concated.equals(expectedConcated));

    // Test 3
    ary1 = new int[0];
    ary2 = new int[0];

    concated = aryToString(concatArray(ary1, ary2));
    System.out.println("\nConcated Array: " + concated);

    expectedConcated = aryToString(new int[0]);
    System.out.println("Expected Array: " + expectedConcated);

    System.out.println(concated.equals(expectedConcated));



  }
}
