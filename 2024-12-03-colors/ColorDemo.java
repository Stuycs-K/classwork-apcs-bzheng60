public class ColorDemo {
  public static final String RESET = "\u001b[0m";
  
  public static final String RESET_CURSOR = "\u001b[H";
  public static final String HIDE_CURSOR = "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static final String CLEAR_SCREEN =  "\u001b[2J";
  
  public static final String RED = "\u001b[31m";
  public static final String ORANGE = "\u001b[38;2;255;165;0m";
  public static final String YELLOW = "\u001b[33m";
  public static final String GREEN = "\u001b[32m";
  public static final String BLUE = "\u001b[34m";
  public static final String MAGENTA = "\u001b[35m";

  public static final String[] colors = new String[] {RED, ORANGE, YELLOW, GREEN, BLUE, MAGENTA};

  public static void sleep(int milli){
    try{
      Thread.sleep(milli);
    }
    catch(Exception e) {
    }
  }

  public static void drawBlock(int shift) {
    for (int length = 0; length < 10; length++) {
      for (int width = 0; width < 30; width++) {
        int colorIndex = (length+width + shift) % colors.length;
        System.out.print(colors[colorIndex]);
        System.out.print("[0]");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.print(HIDE_CURSOR);
    for (int i = 0; i < 25; i++) {
      for (int shift = 0; shift < colors.length; shift++) {
        System.out.print(RESET_CURSOR);
        drawBlock(shift);
        sleep(25);
      }
    }
    System.out.print(SHOW_CURSOR);
    System.out.print(RESET);
    System.out.print(CLEAR_SCREEN);

  }
  
}
