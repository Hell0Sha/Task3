package calculator.NegativPositiv;

import org.testng.annotations.Factory;

public class IsNegativePositiveFactory  {

    @Factory
    public Object [] NegativePositiveDataProvider(){
        return new Object[]{
                new IsNegativeTest(-1, true),
                new IsNegativeTest(0, false),
                new IsNegativeTest(1, false),
                new IsNegativeTest( -9223372036854775808L, true),


                new IsPositiveTest(-2147483648, false),
                new IsPositiveTest(9223372036854775807L, true),
                new IsPositiveTest(9223372036854775807L + 1, true),

        };
    }


}
