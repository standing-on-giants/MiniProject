import org.junit.Test;

import java.beans.Transient;

import org.junit.Assert;

public class CalculatorTest {
    @Test
    public void testSquareRoot(){
        ScientificCalculator calculator = new ScientificCalculator();
        int result1 = calculator.squareRoot(4);
        Assert.assertEquals(2, result1);


    }













    
    @Test
    public void testFactorial(){

    }

    @Test
    public void testLog_e(){

    }

    @Test
    public void testPower(){

    }
}
