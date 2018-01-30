package JUnit.calculator.Trigonometric;

import JUnit.calculator.Arithmetic.BaseJUnitTestClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Alena_Shaadt on 1/29/2018.
 */
@RunWith(Parameterized.class)
public class CtgTest extends BaseJUnitTestClass{
    private double a;

    private double expected;

    public CtgTest(double axpected,double a) {
        this.a = a;
        this.expected = axpected;
    }

    @Test
    public void  testCtg(){
        Assert.assertEquals(expected, calculator.ctg(a), 0.0 );

    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {1/Math.tanh(60),60},
                {1/Math.tanh(30),30},
                {1/Math.tanh(-180),-180}
        });
    }
}
