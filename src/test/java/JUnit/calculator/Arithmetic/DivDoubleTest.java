package JUnit.calculator.Arithmetic;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.fail;

/**
 * Created by Alena_Shaadt on 1/30/2018.
 */
@RunWith(Parameterized.class)
public class DivDoubleTest extends BaseJUnitTestClass{
    private double inputA;
    private double inputB;
    private double  expected;
    private DivDoubleTest divDoubleTest;

    @Before
    public void initialize() {
        divDoubleTest = new DivDoubleTest(inputA,inputB,expected);
    }

    public DivDoubleTest(double inputA, double inputB, double expected) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.expected = expected;
    }

    @Test()
    public void testDoubleDiv(){
        double result = calculator.div(inputA,inputB);
        if(result != expected)
            fail("Div Error.");
        // Assert.assertEquals(calculator.div(inputA,inputB),expected);
    }

    @Test(expected = NumberFormatException.class)
    public void divZiroTest(){
        calculator.div(1.3,0);
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {-4.9e-324, 1, -4.9e-324 / 1},
                {-4.9e-324, -1, -4.9e-324 / (-1)},
                {1.7e+308, 1, 1.7e+308/1},
                {1.7e+308, -1, 1.7e+308/(-1)}
        });
    }
}
