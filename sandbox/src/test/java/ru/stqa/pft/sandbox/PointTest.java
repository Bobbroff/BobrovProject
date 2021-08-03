package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testPoint () {
        Point a = new Point(2, 5);
        Point b = new Point(1,10);
        Assert.assertEquals(a.distance(b),5.0990195135927845);
    }

}
