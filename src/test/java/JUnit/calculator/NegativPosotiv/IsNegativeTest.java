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
public class IsNegativeTest extends BaseJUnitTestClass {
    private long a;

    private boolean expectedResult;


    public IsNegativeTest(long a, boolean expectedResult) {
        this.a = a;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testNeg(){
        Assert.assertEquals(calculator.isNegative(a), expectedResult);
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {-1,true},
                {0,false},
                {1, false}
        });
    }

}
