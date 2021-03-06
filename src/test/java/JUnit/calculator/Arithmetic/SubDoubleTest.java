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
public class SubDoubleTest extends BaseJUnitTestClass {
    private double inputA;
    private double inputB;
    private double  expected;
    private SubDoubleTest subDoubleTest;

    @Before
    public void initialize() {
        subDoubleTest = new SubDoubleTest(inputA,inputB,expected);
    }

    public SubDoubleTest(double inputA, double inputB, double expected) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.expected = expected;
    }

    @Test()
    public void testDoubleSub(){
        double result = calculator.sub(inputA,inputB);
        if(result != expected)
            fail("Sub double Error.");
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {1.0, 0 , 1.0},
                {-1.0, 0, -1.0},
                {-4.9e-324, 1, -4.9e-324-1},
                {-4.9e-324, -1, -4.9e-324+1},
                {1.7e+308, 1, 1.7e+308-1},
                {1.7e+308, -1, 1.7e+308+1}
        });
    }
}
