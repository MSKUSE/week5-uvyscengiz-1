public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5);

        Point tLeft = new Point(3, 4);
        Rectangle r = new Rectangle(tLeft, 3, 4);
        System.out.println(r.getSideA());
        System.out.println(r.getSideB());
        System.out.println(r.getTopLeft());

        Circle c1 = new Circle(
                new Point(3, 4),
                5
        );

        System.out.println(c1.getRadius());
    }
}