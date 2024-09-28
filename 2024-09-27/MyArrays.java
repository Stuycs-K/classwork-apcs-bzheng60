public class MyArrays {
  public static int[] returnCopy(int[] ary) {
    int[] aryCopy = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      aryCopy[i] = ary[i];
    }
    return aryCopy;
  }

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
  public static void main(String[] args) {
    // aryToString test
    int[] ary = {1, 2, 3, 5, 6};
    System.out.println(aryToString(ary));
    // returnCopy test cases
    ary = new int[10];
    String original = aryToString(ary);
    String copy = aryToString(returnCopy(ary));
    System.out.println("Original: " + original + "\nCopy: " + copy);
    System.out.println(copy.equals(original));

    ary = new int[] {};
    original = aryToString(ary);
    copy = aryToString(returnCopy(ary));
    System.out.println("Original: " + original + "\nCopy: " + copy);
    System.out.println(copy.equals(original));

    ary = new int[] {5, 2, 0, 10, 33, 56};
    original = aryToString(ary);
    copy = aryToString(returnCopy(ary));
    System.out.println("Original: " + original + "\nCopy: " + copy);
    System.out.println(copy.equals(original));



  }
}
