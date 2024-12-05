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
    public static int bright(int color) {
        return color + 60;
    }

    public static void goTo(int x, int y) {
        System.out.print(ESC + y + ";" + x + "H");
    }

    public static void numColor (int x) {
        if (x < 25) {
            color(bright(RED)); 
        }
        if (x > 75) {
            color(bright(GREEN)); 
        }
    }
    public static void background() {
        color(background(BLUE));
        for (int x = 1; x <= 80; x++) {
            if (x == 1 || x == 80) {
                for (int y = 1; y <= 30; y++) {
                    goTo(x, y);
                    System.out.print(" ");
                }
            }
            else {
                goTo(x, 1);
                System.out.print(" ");
                goTo(x, 30);
                System.out.print(" ");
            }
        }
    }

    public static void drawRandoNums() {
        int[] randomInts = new int[3];
        for (int i = 0; i < 3; i++) {
            int rand = (int) (Math.random() * 100);
            randomInts[i] = rand;

            goTo(1 + 20*(i+1), 2);
            numColor(rand);
            System.out.print(rand);
            System.out.print(RESET);
        }
    }

    public static void divider() {
        for (int x = 2; x < 80; x++) {
            goTo(x, 3);
            System.out.print("=");
        }
    }
    

    public static void main(String[] args) {
        System.out.print(CLEAR_SCREEN);

        background();
        
        System.out.print(RESET);

        drawRandoNums();

        color(background(BLUE)); 

        divider();

        goTo(1, 31);
        System.out.print(RESET);

       
    }


}