// Brian Zheng: brianz76@nycstudents.net
// Robinson Zhang: robinsonz@nycstudents.net

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

  public static int arr2DSum(int[][] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  public static int[][] swapRC(int[][] nums) {
    int[][] swapped = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        swapped[j][i] = nums[i][j];
      }
    }
    return swapped;
  }

  public static void main(String[] args) {
    // aryToString for 2d tests
    System.out.println(aryToString(new int[][] {{1, 2}, {4, 5}, {6, 7}}));
    System.out.println(aryToString(new int[][] {{2354, 125}, {24, 2452, 8942, 2542}, {7}, {24524, 1341, 21}}));
    System.out.println(aryToString(new int[4][6]));

    // array 2D sum test cases
    System.out.println(arr2DSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) == 45);
    System.out.println(arr2DSum(new int[10][10]) == 0);
    System.out.println(arr2DSum(new int[][] {{2354, 125}, {24, 2452, 8942, 2542}, {7}, {24524, 1341, 21}}) == 42332);

    // swapRC test cases
    System.out.println(aryToString(swapRC(new int[][] {{1,2,3},{4,5,6}})).equals(aryToString(new int[][] {{1,4},{2,5},{3,6}})));
    System.out.println(aryToString(swapRC(new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,11,12}})).equals(aryToString(new int[][] {{1,4,7,10},{2,5,8,11},{3,6,9,12}})));
    System.out.println(aryToString(swapRC(new int[][] {{0,0},{0,0},{0,0}})).equals(aryToString(new int[][] {{0,0,0},{0,0,0}})));
  }
}
