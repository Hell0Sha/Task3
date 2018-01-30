package calculator.Arithmetic;

import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseCalculatorTest {

    @Test(dataProvider = "powDataProvider")
    public void powTest(double a, double b, double expected){
        Assert.assertEquals(calculator.pow(a,b), expected);
    }

    @DataProvider(name = "powDataProvider")
    public Object[][] powDataProvider(){
        return new Object[][]{
                {0,0,1},
                { -4.9e-324,1,Math.pow( -4.9e-324,1)},
                {1.7e+308,-1, Math.pow(1.7e+308,-1)}
        };
    }

}
