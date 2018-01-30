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
public class MultDoubleTest extends BaseJUnitTestClass {
    private double inputA;
    private double inputB;
    private double  expected;
    private MultDoubleTest multDoubleTest;

    @Before
    public void initialize() {
        multDoubleTest = new MultDoubleTest(inputA,inputB,expected);
    }

    public MultDoubleTest(double inputA, double inputB, double expected) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.expected = expected;
    }

    @Test()
    public void testMultDiv(){
        double result = calculator.mult(inputA,inputB);
        if(result != expected)
            fail("Mult Error.");
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {1.0, 0 , 0},
                {-1.0, 0, -0.0},
                {-4.9e-324, 1, -4.9e-324 * 1},
                {-4.9e-324, -1, -4.9e-324 * (-1)},
                {1.7e+308, 1, 1.7e+308},
                {1.7e+308, -1, -1.7e+308}
        });
    }
}
