public class ArrayMethods {

  public static String aryToString(int[]nums){
    String arrayConvert= "[";
    for (int i = 0; i< nums.length; i++){
      arrayConvert+=nums[i];
      if(i<nums.length-1){
        arrayConvert+=", ";
      }
    }
    arrayConvert+="]";
    return arrayConvert;
  }

  public static String aryToString(int[][] nums){
    String arrayConvert= "[";
    for (int i = 0; i< nums.length; i++){
      for(int j = 0; j<nums[i].length;j++){
        if (j==0){
          arrayConvert+="[";
        }
        arrayConvert+=nums[i][j];
        if (j==nums[i].length-1){
          arrayConvert+="]";
        }
        if(j<nums[i].length-1){
          arrayConvert+=", ";
        }
      }
      if(i<nums.length-1){
        arrayConvert+=", ";
      }
    }
    arrayConvert+="]";
    return arrayConvert;
  }

  public static int ary2DSum(int[][] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    // array 2D sum test cases
    // System.out.println(arr2DSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) == 45);
    // System.out.println(arr2DSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) == 45);

    // aryToString for 2d tests
    System.out.println(aryToString(new int[][] {{1, 2}, {4, 5}, {6, 7}}));
  }
}
