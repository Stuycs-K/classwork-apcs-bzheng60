public class ColorDemo {
  public static final String RESET = "\u001b[0m";
  public static final String HIDE_CURSOR = "\u001b[?25l";
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  
  public static final String RED = "\u001b[31m";
  public static final String ORANGE = "\u001b[38;2;255;165;0m";
  public static final String YELLOW = "\u001b[33m";
  public static final String GREEN = "\u001b[32m";
  public static final String BLUE = "\u001b[34m";
  public static final String MAGENTA = "\u001b[35m";

  public static final String[] colors = new String[] {RED, ORANGE, YELLOW, GREEN, BLUE, MAGENTA};

  public static void main(String[] args) {
    System.out.print(CLEAR_SCREEN);

    for (int lines = 0; lines < 100; lines++) {
      for (int i = 0; i < 30; i++) {
        int colorIndex = (lines+i) % colors.length;
        System.out.print(colors[colorIndex]);
        System.out.print("a");
      }
      System.out.println();
    }
    
  }
}
