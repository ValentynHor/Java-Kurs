package section11_junit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class Vector2DTest {

    private final double EPS = 1e-9;

    private static Vector2D vector;

    @BeforeClass
    public static void createNewVector() {
        vector = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        Assert.assertEquals(0, vector.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Assert.assertEquals(0, vector.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Assert.assertEquals(0, vector.getY(), EPS);
    }


/*

    @Test
    public void newVectorShouldHaveZeroYAndZeroY(){
        Assert.assertEquals(0, vector.getX(), EPS);
        Assert.assertEquals(0, vector.getY(), EPS);

    }

*/

}