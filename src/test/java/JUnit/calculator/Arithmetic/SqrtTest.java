package JUnit.calculator.Arithmetic;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.fail;

@RunWith(Parameterized.class)
public class SqrtTest extends BaseJUnitTestClass {

    private double inputA;
    private double expected;
    SqrtTest sqrtTest;

    @Before
    public void initialize() {
        sqrtTest = new SqrtTest(inputA,expected);
    }

    public SqrtTest(double inputA, double expected) {
        this.inputA = inputA;
        this.expected = expected;
    }

    @Test()
    public void testSqrt(){
        double result = calculator.sqrt(inputA);
        if(result != expected)
            fail("Sqrt Error.");
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {-4, Math.sqrt(Math.abs(-4))},
                {81,Math.sqrt(81)},
                {5632,Math.sqrt(5632)},
                {0, Math.sqrt(0)}
        });
    }

}
