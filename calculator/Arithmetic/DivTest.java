package calculator.Arithmetic;

import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class DivTest extends BaseCalculatorTest {

    @Test(dataProvider = "divDoubleDataProvider")
    public void testDoubleDiv(double a, double b, double expected){
        Assert.assertEquals(calculator.div(a,b),expected);
    }

    @Test(dataProvider = "divLongDataProvider")
    public void testLongDiv(long a, long b, long expected){
        Assert.assertEquals(calculator.div(a,b),expected);
    }

    @Test(dataProvider = "divStringDataProvider")
    public void testStringDiv(String a, String b, String expected){
        long aLong = Long.parseLong(a);
        long bLong = Long.parseLong(b);
        long expectedLong = Long.parseLong(expected);
        Assert.assertEquals(calculator.div(aLong,bLong),expectedLong);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    @Parameters({"numA", "numB"})
    public void divZiroTest( @Optional("1") long numA,@Optional("0") long numB){
        calculator.div(numA,numB);
    }

    @DataProvider(name = "divDoubleDataProvider")
    public Object [][] divDoubleDataProvider(){
        return new Object[][]{
                {-4.9e-324, 1, -4.9e-324 / 1},
                {-4.9e-324, -1, -4.9e-324 / (-1)},
                {1.7e+308, 1, 1.7e+308/1},
                {1.7e+308, -1, 1.7e+308/(-1)}
        };
    }

    @DataProvider(name = "divLongDataProvider")
    public Object [][] divLongDataProvider(){
        return new Object[][]{
                {0,1,0},
                {-9223372036854775808L,1, -9223372036854775808L / 1},
                {-9223372036854775808L, -1, -9223372036854775808L/(-1)},
                {9223372036854775807L, 1, 9223372036854775807L/1},
                {9223372036854775807L, -1, 9223372036854775807L/(-1)}
        };
    }

    @DataProvider(name = "divStringDataProvider")
    public Object [][] divStringDataProvider(){
        return new Object[][]{
                {"0","1","0"},
        };
    }

}
