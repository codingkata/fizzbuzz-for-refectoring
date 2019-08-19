import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private static Main main;

    @BeforeClass
    public static void before() {
        main = new Main();
    }

    @Test
    public void fizzBuzzText() throws Exception {
    }

    @Test
    public void isFizzBuzzTest() throws Exception {
        Assert.assertTrue(main.isFizzBuzz(35, 5, 7));
        Assert.assertTrue(main.isFizzBuzz(24, 4, 6));
        Assert.assertFalse(main.isFizzBuzz(23, 2, 3));
    }

    @Test
    public void isFizzOrBuzzTest() throws Exception {
        Assert.assertTrue(main.isFizzOrBuzz(77, 7));
        Assert.assertTrue(main.isFizzOrBuzz(10, 0));
        Assert.assertFalse(main.isFizzOrBuzz(32, 7));
    }

}