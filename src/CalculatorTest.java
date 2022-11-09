import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator=new Calculator();
    @Test
    public void addTest() {
        Assert.assertEquals(12,calculator.add(7.0,5.0),0.0001);

    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(2,calculator.subtract(7,5),0.0001);

    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(35,calculator.multiply(7,5),0.001);

    }

    @Test
    public void divTest() {
        Assert.assertEquals(1.4,calculator.div(7,5),0.001);

    }
}