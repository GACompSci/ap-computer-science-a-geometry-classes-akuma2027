public class Rectangle {
    private double width;
    private double length;
    private Point topleft;

    public Rectangle(double w, double l, Point start){
        width = w;
        length = l;
        topleft = start;

    }

    public double getArea(){
        return (double) MathTools.round(length * width, 2);
    }



}
