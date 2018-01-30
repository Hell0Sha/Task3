package JUnit.calculator.Arithmetic;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubLongTest extends BaseJUnitTestClass {

    private long inputA;
    private long inputB;
    private  long expected;
    SubLongTest subLongTest;

    @Before
    public void initialize() {
        subLongTest = new SubLongTest(inputA,inputB,expected);
    }

    public SubLongTest(long inputA, long inputB, long expected) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.expected = expected;
    }

    @Test()
    public void testLongSub(){
        Assert.assertEquals(calculator.sub(inputA,inputB),expected);
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {0,0,0},
                {-2,2,-4},
                {-3000,-750, -2250},
                {-9223372036854775808L, -1, -9223372036854775807L}
        });
    }


}
