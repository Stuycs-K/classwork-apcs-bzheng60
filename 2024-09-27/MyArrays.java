public class MyArrays {
  public static int[] returnCopy(int[] )

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
    System.out.println(aryToString(new int[] {1, 2, 3, 5, 6}));
    // returnCopy test cases
    int[] ary1 = {1, 2, 3, 6, 8, 3, 4};
    System.out.println(aryToString(returnCopy(new int[] {1, 2, 3, 6, 8, 3, 4})).equals(aryToString(ary1)));


  }
}
