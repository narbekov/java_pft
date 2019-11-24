package ru.stqa.pft.sandbox;

public class Distance {

    public static void main(String[] args)
    {
        Point p1 = new Point(2,2);
        Point p2 = new Point(4,4);

        System.out.println("Расстояние между точками с координатами:" +"A:("+ p1.x + " " + p1.y +" )" + " и "+"Б:("+ + p2.x +" "+ p2.y +" )" + " = "+ p1.distance(p2));
    }
}
