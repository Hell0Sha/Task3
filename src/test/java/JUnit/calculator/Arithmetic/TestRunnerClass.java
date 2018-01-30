package JUnit.calculator.Arithmetic;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Alena_Shaadt on 1/29/2018.
 */
public class TestRunnerClass {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuitClass.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
