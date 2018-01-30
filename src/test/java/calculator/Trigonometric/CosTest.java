package calculator.Trigonometric;

import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculatorTest {

    private double a;

    private double expected;


    public CosTest(double a, double axpected) {
        this.a = a;
        this.expected = axpected;
    }

    @Test
    public void  testCos(){
        Assert.assertEquals(calculator.cos(a), expected );

    }
}
