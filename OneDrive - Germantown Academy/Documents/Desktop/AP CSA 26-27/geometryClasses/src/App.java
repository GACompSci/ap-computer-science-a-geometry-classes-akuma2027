public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        System.out.println(MathTools.randint(1, 10));
        System.out.println(MathTools.round(9.354235, 4));

        Point a = new Point(6, 7);
        Point b = new Point(4, 1);

        System.out.println(MathTools.distance(a, b));
    }
}
