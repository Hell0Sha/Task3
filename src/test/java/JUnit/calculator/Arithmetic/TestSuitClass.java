package JUnit.calculator.Arithmetic;

import JUnit.calculator.NegativPosotiv.IsNegativeTest;
import JUnit.calculator.Trigonometric.CtgTest;
import JUnit.calculator.Trigonometric.SinTest;
import JUnit.calculator.Trigonometric.TgTest;
import JUnit.calculator.NegativPosotiv.IsPositiveTest;
import JUnit.calculator.Trigonometric.CosTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Alena_Shaadt on 1/29/2018.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        DivLongTest.class,
        MultLongTest.class,
        PowTest.class,
        SqrtTest.class,
        SubLongTest.class,
        SumLongTest.class,
        IsNegativeTest.class,
        IsPositiveTest.class,
        CosTest.class,
        CtgTest.class,
        TgTest.class,
        SinTest.class
})
public class TestSuitClass {
}
