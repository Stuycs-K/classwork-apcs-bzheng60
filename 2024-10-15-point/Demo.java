public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    // More test cases
    Point origin = new Point(0, 0);
    System.out.println( distance(p3,origin));
    System.out.println( Point.distance(p3,origin));
    System.out.println( p3.distanceTo(origin));

    // Equilateral Triangle
    Point v1 = new Point (-0.5, 0);
    Point v2 = new Point (0.5, 0);
    Point v3 = new Point (0, Math.sqrt(3) / 2);

    // side lengths
    System.out.println(Point.distance(v1, v2));
    System.out.println(Point.distance(v2, v3));
    System.out.println(Point.distance(v3, v1));
  }
}
