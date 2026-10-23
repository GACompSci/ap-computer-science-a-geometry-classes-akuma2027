public class Triangle {
    private Point verticeA;
    private Point verticeB;
    private Point verticeC;
    public Triangle(Point A, Point B, Point C){
        verticeA = A;
        verticeB = B;
        verticeC = C;

    }
     public double getArea(){
        return MathTools.round(0.5* Math.abs(verticeA.getX() * (verticeB.getY() - verticeC.getY()) + verticeB.getX() * (verticeC.getY() - verticeA.getY()) + verticeC.getX() * (verticeA.getY() - verticeB.getY() )), 2) ;
     }
}
   
