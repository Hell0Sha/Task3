package calculator.Arithmetic;

import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SqrtTest extends BaseCalculatorTest {

    @Test(dataProvider = "sqrtDataProvider")
    public void testSqrt(double a, double expected){
        Assert.assertEquals(calculator.sqrt(a),expected);
    }


    @DataProvider(name = "sqrtDataProvider")
    public Object [][] sqrtDataProvider(){
        return new Object[][]{
                {-4,2.0},
                {0,0},
                {5632,75.04665215717488},
                {1.7e+308, Math.sqrt(1.7e+308)}
        };
    }
}
