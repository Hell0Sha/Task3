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
public class CosTest extends BaseJUnitTestClass {

    private double a;

    private double expected;

    public CosTest(double axpected,double a) {
        this.a = a;
        this.expected = axpected;
    }

    @Test
    public void  testCos(){
        Assert.assertEquals(expected, calculator.cos(a), 0.0 );

    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {Math.cos(0),0},
                {Math.cos(30),30},
                {Math.cos(-180),-180}
        });
    }
}
