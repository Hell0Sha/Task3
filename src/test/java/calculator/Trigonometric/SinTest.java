package calculator.Trigonometric;

import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SinTest extends BaseCalculatorTest {
    private double a;

    private double expected;


    public SinTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void  testSin(){
        Assert.assertEquals(calculator.sin(a), expected );

    }
}
