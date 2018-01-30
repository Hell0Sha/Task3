package JUnit.calculator.Arithmetic;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.fail;

@RunWith(Parameterized.class)
public class DivLongTest extends BaseJUnitTestClass {
    private long inputA;
    private long inputB;
    private  long expected;
    private DivLongTest divLongTest;

    @Before
    public void initialize() {
       divLongTest = new DivLongTest(inputA,inputB,expected);
    }

    public DivLongTest(long inputA, long inputB, long expected) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.expected = expected;
    }

    @Test()
    public void testLongDiv(){
        long result = calculator.div(inputA,inputB);
        if(result != expected)
            fail("Div Error.");
       // Assert.assertEquals(calculator.div(inputA,inputB),expected);
    }

    @Test(expected = NumberFormatException.class)
    public void divZiroTest(){
        calculator.div(1,0);
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {-2,2,-1},
                {3000,500, 6},
                {-9223372036854775808L, 1, -9223372036854775808L},
                {9223372036854775807L, 1, 9223372036854775807L}
        });
    }
    //создать метод преобразования
}
