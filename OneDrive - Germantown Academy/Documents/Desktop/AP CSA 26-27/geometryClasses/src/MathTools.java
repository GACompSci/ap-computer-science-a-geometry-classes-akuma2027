public class MathTools {
    //Create the static MathTools methods in this file
        /* 
        randInt(int min, int max)
        round(double num, int places)
        distance(Point a, Point b)
        slope(Point a, Point b)
        */
       public static int randint(int min, int max){
            return (int) (Math.random() * (max-min+1)) + min;
       
       }
       public static double round(double num, int places){
        return ((int) (num * Math.pow(10, places) + 0.5)) / Math.pow(10,places);
       }
       public static double distance(Point a, Point b){
       return MathTools.round(Math.pow(Math.pow((double) a.getX() + (double) b.getX(), 2) + Math.pow((double) a.getY() + (double) b.getY(), 2), 0.5), 5);
       }
        
}

