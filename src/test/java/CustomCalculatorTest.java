import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,10);
        assertTrue(result == 20);
        //assertFalse(result == 20);
    }

    @Test
    public void subtractTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10,10);
        assertTrue(result == 0);
    }

    @Test
    public void multiplyTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,0);
        assertTrue(result == 0);
    }

    @Test
    public void divideTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10,2);
        assertFalse(result == 4);
    }

}