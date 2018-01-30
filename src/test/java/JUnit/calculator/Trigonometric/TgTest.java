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
public class TgTest extends BaseJUnitTestClass {
    private double a;

    private double expected;

    public  TgTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void  testTg(){
        Assert.assertEquals(expected, calculator.tg(a), 0.0 );
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {30,Math.tanh(30)},
                { 45,Math.tanh(45)},
                { 60, Math.tanh(60)}
        });
    }
}
