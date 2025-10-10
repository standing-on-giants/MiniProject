

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    
    private static final double DELTA = 0.0001; // For double comparison
    
    // Square Root Tests
    @Test
    public void testSquareRootPositive() {
        double result = ScientificCalculator.squareRoot(16);
        Assert.assertEquals(4.0, result, DELTA);
    }
    
    @Test
    public void testSquareRootZero() {
        double result = ScientificCalculator.squareRoot(0);
        Assert.assertEquals(0.0, result, DELTA);
    }
    
    @Test
    public void testSquareRootDecimal() {
        double result = ScientificCalculator.squareRoot(2.25);
        Assert.assertEquals(1.5, result, DELTA);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegative() {
        ScientificCalculator.squareRoot(-4);
    }
    
    // Factorial Tests
    @Test
    public void testFactorialZero() {
        long result = ScientificCalculator.factorial(0);
        Assert.assertEquals(1, result);
    }
    
    @Test
    public void testFactorialPositive() {
        long result = ScientificCalculator.factorial(5);
        Assert.assertEquals(120, result);
    }
    
    @Test
    public void testFactorialOne() {
        long result = ScientificCalculator.factorial(1);
        Assert.assertEquals(1, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        ScientificCalculator.factorial(-5);
    }
    
    // Natural Logarithm Tests
    @Test
    public void testNaturalLogPositive() {
        double result = ScientificCalculator.naturalLog(Math.E);
        Assert.assertEquals(1.0, result, DELTA);
    }
    
    @Test
    public void testNaturalLogOne() {
        double result = ScientificCalculator.naturalLog(1);
        Assert.assertEquals(0.0, result, DELTA);
    }
    
    @Test
    public void testNaturalLogLargeNumber() {
        double result = ScientificCalculator.naturalLog(10);
        Assert.assertEquals(2.302585, result, DELTA);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogZero() {
        ScientificCalculator.naturalLog(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogNegative() {
        ScientificCalculator.naturalLog(-5);
    }
    
    // Power Tests
    @Test
    public void testPowerPositive() {
        double result = ScientificCalculator.power(2, 3);
        Assert.assertEquals(8.0, result, DELTA);
    }
    
    @Test
    public void testPowerZeroExponent() {
        double result = ScientificCalculator.power(5, 0);
        Assert.assertEquals(1.0, result, DELTA);
    }
    
    @Test
    public void testPowerNegativeExponent() {
        double result = ScientificCalculator.power(2, -2);
        Assert.assertEquals(0.25, result, DELTA);
    }
    
    @Test
    public void testPowerDecimal() {
        double result = ScientificCalculator.power(4, 0.5);
        Assert.assertEquals(2.0, result, DELTA);
    }
}
