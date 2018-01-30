package calculator.Arithmetic;

import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTest extends BaseCalculatorTest {

    @Test(dataProvider = "subLongDataProvider")
    public void testLongSub(long a, long b, long expected){
        Assert.assertEquals(calculator.sub(a,b),expected);
    }


    @Test(dataProvider = "subDoubleDataProvider")
    public void testDoubleSub(double a, double b, double expected){
            Assert.assertEquals(calculator.sub(a,b),expected);
    }

    @Test()
    public void subOverFlow(){
        Assert.assertEquals(calculator.sub(Long.MAX_VALUE,1), "Overflow!");//т к нет условий, то предусмотрим такой вариант на случай переполнения
    }

    @DataProvider(name = "subDoubleDataProvider")
    public Object[][] SubDoubleDataProvider() {
        return new Object[][]{
                {1.0, 0 , 1.0},
                {-1.0, 0, -1.0},
                {-4.9e-324, 1, -4.9e-324-1},
                {-4.9e-324, -1, -4.9e-324+1},
                {1.7e+308, 1, 1.7e+308-1},
                {1.7e+308, -1, 1.7e+308+1}
        };
    }
        @DataProvider(name = "subLongDataProvider")
    public Object [][] subLongDataProvider(){
        return new Object[][]{
                {0,0,0},
                {-1,0,-1},
                {0,1,-1},
                {-9223372036854775808L,1, -9223372036854775808L - 1},
                {-9223372036854775808L, -1, -9223372036854775808L+1},
                {9223372036854775807L, 1, 9223372036854775807L-1},
                {9223372036854775807L, -1, 9223372036854775807L+1}
        };
    }
}
