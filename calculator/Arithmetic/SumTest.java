package calculator.Arithmetic;
import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseCalculatorTest {

    @Test(dataProvider = "sumLongDataProvider")
    public void testLongSum(long a, long b, long expected){
        checkTime();
        Assert.assertEquals(calculator.sum(a,b),expected);
    }

    @Test(dataProvider = "sumDoubleDataProvider")
    public void testDoubleSum(double a,  double b, double expected){
        checkTime();
        Assert.assertEquals(calculator.sum(a,b), expected);
    }

    @Test(groups = "test-group")
    public void test(){
        System.out.println("This is a test sum group!");
    }

    @DataProvider(name = "sumDoubleDataProvider")
    public Object[][] SumDoubleDataProvider(){
        return new Object[][]{
                {1.0, 0 , 1.0},
                {-1.0, 0, -1.0},
                {-4.9e-324, 1, -4.9e-324+1},
                {-4.9e-324, -1, -4.9e-324-1},
                {1.7e+308, 1, 1.7e+308+1},
                {1.7e+308, -1, 1.7e+308-1}
        };

    }

    @Test
    public void sumOverFlow(){
        Assert.assertEquals(calculator.sum(Long.MIN_VALUE,1), "Overflow!");//т к нет условий, то предусмотрим такой вариант на случай переполнения
    }

    @DataProvider(name = "sumLongDataProvider" )
    public Object [][] SumLongDataProvider(){
        return new Object[][]{
                {0,0,0},
                {-1,0,-1},
                {0,1,1},
                {-9223372036854775808L,1, -9223372036854775808L + 1},
                {-9223372036854775808L, -1, -9223372036854775808L-1},
                {9223372036854775807L, 1, 9223372036854775807L+1},
                {9223372036854775807L, -1, 9223372036854775807L-1}
        };
    }

}
