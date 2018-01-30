package JUnit.calculator.Arithmetic;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.fail;

@RunWith(Parameterized.class)
public class PowTest extends BaseJUnitTestClass {

    private double inputA;
    private double inputB;
    private  double expected;
    private PowTest powTest;

    @Before
    public void initialize() {
        powTest = new PowTest(inputA,  inputB, expected);
    }

    public PowTest(double inputA, double inputB, double expected) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.expected = expected;
    }



    @Test()
    public void powTest(){
        double result = calculator.pow(inputA,inputB);
        if(result != expected)
            fail("Div Error.");
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {1,0,1},
                {-1,32,1},
                {3.2,1,3.2},
                {2.0, 5.3, 32}
        });
    }


}
