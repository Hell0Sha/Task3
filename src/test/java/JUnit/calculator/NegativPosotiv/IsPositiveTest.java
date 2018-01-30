package JUnit.calculator.NegativPosotiv;

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
public class IsPositiveTest extends BaseJUnitTestClass {

    private long a;

    private boolean expectedResult;


    public IsPositiveTest(long a, boolean expectedResult) {
        this.a = a;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testPos(){
        Assert.assertEquals(calculator.isPositive(a), expectedResult);
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {-1,false},
                {0,false},
                {1, true}
        });
    }
}
