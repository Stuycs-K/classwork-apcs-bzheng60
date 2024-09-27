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
  public static void main(String[] args) {
    System.out.println(aryToString(new int[] {1, 2, 3, 5, 6}));
  }
}
