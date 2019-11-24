package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testDistance0 ()
    {
        Point p1 = new Point(2,2);
        Point p2 = new Point(4,4);

        Assert.assertEquals(p1.distance(p2),2.8284271247461903);
    }

    @Test
    public void testDistance1 ()
    {
        Point p1 = new Point(2147483647,-2147483648);
        Point p2 = new Point(2147483646,-2147483646);

        double result = p1.distance(p2);
        Assert.assertEquals(p1.distance(p2),result);
    }

    @Test
    public void testDistance3 ()
    {
        Point p1 = new Point(1,-2);
        Point p2 = new Point(3,-4);

        double result = p1.distance(p2);
        Assert.assertEquals(p1.distance(p2),"qwerty");
    }
}
