public class Driver {
    public static final String ESC = "\033[";

    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int MAGENTA = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;

    public static final String CLEAR_SCREEN =  "\033[2J";
    public static final String HIDE_CURSOR =  "\033[?25l";
    public static final String SHOW_CURSOR =  "\033[?25h";

    public static final String RESET = "\033[0m"+SHOW_CURSOR;

    public static void color(int num) {
        System.out.print(ESC + num + "m");
    }

    public static int background(int color){
        return color + 10;
    }

    public static void goTo(int x, int y) {
        System.out.print(ESC + y + ";" + x + "H");
    }

    public static void main(String[] args) {
        System.out.print(CLEAR_SCREEN);

        color(background(BLUE));
        for (int x = 1; x <= 30; x++) {
            if (x == 1 || x == 30) {
                for (int y = 1; y <= 80; y++) {
                    goTo(x, y);
                    System.out.print(" ");
                }
            }
            else {
                goTo(x, 1);
                System.out.print(" ");
                goTo(x, 80);
                System.out.print(" ");
            }
        }

        System.out.print(RESET);
    }

}