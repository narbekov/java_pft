package ru.stqa.pft.sandbox;

public class Distance {

    public static void main(String[] args)
    {
        Point p1 = new Point(2.0,2.0);
        Point p2 = new Point(4.0,4.0);

        System.out.println("Расстояние между точками с координатами:" +"A:("+ p1.x + " " + p1.y +" )" + " и "+"Б:("+ + p2.x +" "+ p2.y +" )" + " = "+ distance(p1,p2));
    }
    public static double distance(Point p1, Point p2)
    {
        return Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x)+((p2.y-p1.y)*(p2.y-p1.y))));
    }
}
