public class Circle{
    private int radius;
    private Point center;

    public Circle(int radi, Point spot){
        radius = radi;
        center = spot;
    }

    public int getRadius(){
        return radius;
    }

    
    public double getArea(){
        return MathTools.round( Math.PI * ((double) Math.pow(radius, 2)), 2);
    }
}