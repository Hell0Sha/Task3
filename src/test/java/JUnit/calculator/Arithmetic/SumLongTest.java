package JUnit.calculator.Arithmetic;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumLongTest extends BaseJUnitTestClass {
    private long inputA;
    private long inputB;
    private  long expected;
    SumLongTest sumLongTest;

    @Before
    public void initialize() {
        sumLongTest = new SumLongTest(inputA,inputB,expected);
    }

    public SumLongTest(long inputA, long inputB, long expected) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.expected = expected;
    }

    @Test()
    public void testLongSum(){
        Assert.assertEquals(calculator.sum(inputA,inputB),expected);
    }

    @Test()
    public void test(){
        System.out.println("This is a test test!");
    }


    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {0,0,0},
                {-2,2,0},
                {-3000,-750, -3750},
                {-9223372036854775808L, 1, -9223372036854775807L}
        });
    }
}
