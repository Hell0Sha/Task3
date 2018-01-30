package calculator.Arithmetic;

import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTest extends BaseCalculatorTest {

    @Test(dataProvider = "multLongDataProvider")
    public void testLongMult(long a, long b, long expected){
        Assert.assertEquals(calculator.mult(a,b),expected);
    }

    @Test(dataProvider = "multDoubleDataProvider")
    public void testDoubleMult(double a, double b, double expected){
        Assert.assertEquals(calculator.mult(a,b),expected);
    }

    @DataProvider(name = "multDoubleDataProvider")
    public Object [][] multDoubleDataProvider(){
        return new Object[][]{
                {1.0, 0 , 0},
                {-1.0, 0, -0.0},
                {-4.9e-324, 1, -4.9e-324 * 1},
                {-4.9e-324, -1, -4.9e-324 * (-1)},
                {1.7e+308, 1, 1.7e+308},
                {1.7e+308, -1, -1.7e+308}
        };
    }

    @DataProvider(name = "multLongDataProvider")
    public Object [][] multLongDataProvider(){
        return new Object[][]{
                {0,0,0},
                {-1,0,0},
                {0,1,0},
                {-9223372036854775808L,1, -9223372036854775808L},
                {-9223372036854775808L, -1, -9223372036854775808L * (-1)},
                {9223372036854775807L, 1, 9223372036854775807L},
                {9223372036854775807L, -1, -9223372036854775807L}
        };
    }
}
