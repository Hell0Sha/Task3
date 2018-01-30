package calculator.NegativPositiv;

import calculator.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseCalculatorTest {
    private long a;

    private boolean expectedResult;


    public IsPositiveTest(long a, boolean expectedResult) {
        this.a = a;
        this.expectedResult = expectedResult;
    }

    @Test(groups = "test-group")
    public void testPos(){
        Assert.assertEquals(calculator.isPositive(a), expectedResult);
    }
}
