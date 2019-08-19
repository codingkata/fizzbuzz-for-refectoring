import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void getFizzBuzzTest() {
        Solution solution = new Solution();
        String case1 = solution.getFizzBuzz(0, 0);
        Assert.assertEquals(case1, "0\n");
        String case2 = solution.getFizzBuzz(-1, -20);
        Assert.assertEquals(case2, "");
        String case3 = solution.getFizzBuzz(50, 50);
        Assert.assertEquals(case3, "Buzz\n");
        String case4 = solution.getFizzBuzz(100, 1);
        Assert.assertEquals(case4, "");
        String case5 = solution.getFizzBuzz(1, 15);
        Assert.assertEquals(case5, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n14\nFizzBuzz\n");
    }
}
