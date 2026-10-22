public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        System.out.println(MathTools.randint(1, 10));
        System.out.println(MathTools.round(9.354235, 4));

        Point a = new Point(6, 7);
        Point b = new Point(4, 1);
        Circle z = new Circle(5, a);
        Rectangle x = new Rectangle(6, 7, a);
        System.out.println(MathTools.distance(a, b));
        System.out.println(MathTools.slope(a, b));
        System.out.println(z.getArea());
        System.out.println(x.getArea());

    }
}
