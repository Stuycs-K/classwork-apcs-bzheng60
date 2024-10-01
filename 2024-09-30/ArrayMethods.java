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

  public static void replaceNegative(int [][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }
  public static int[] copySubarray (int[][] nums, int index) {
    int[] copySubarray = new int[nums[index].length];
    for (int i = 0;  i < nums[index].length; i++) {
      copySubarray[i] = nums[index][i];
    }
    return copySubarray;
  }

  public static int[][] copy(int[][] nums) {
    int[][] copy = new int[nums.length][];
    for (int i = 0; i < copy.length; i++) {
      copy[i] = copySubarray(nums, i);
    }
    return copy;
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

    // replace Negative tests
    System.out.println("Replace Negative: \n");
    int[][] test = new int[][] {{9, -2, -65},
                                {-9, -6, 92}};
    replaceNegative(test);
    System.out.println(aryToString(test));

    test = new int[][] {{-9, -2, -65},
                        {-9, -6, 92},
                        {-8, 732, -6}};
    replaceNegative(test);
    System.out.println(aryToString(test));

    // copy 2d array Tests
    System.out.println("\nCopy 2d: \n");
    int[][] copyTest = copy(test);
    System.out.println(aryToString(copyTest));

    replaceNegative(test);
    // testing if changing the original changes the copy
    System.out.println(aryToString(copyTest));


    test = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}, {10, 11, 12, 13, 14}};
    copyTest = copy(test);
    System.out.println(aryToString(copyTest));

    replaceNegative(test);
    // testing if changing the original changes the copy
    System.out.println(aryToString(copyTest));


    test = new int[3][5];
    copyTest = copy(test);
    System.out.println(aryToString(copyTest));

    replaceNegative(test);
    // testing if changing the original changes the copy
    System.out.println(aryToString(copyTest));
  }
}
