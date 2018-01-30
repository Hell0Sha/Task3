package JUnit.calculator.Arithmetic;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Created by Alena_Shaadt on 1/29/2018.
 */
public class BaseJUnitTestClass {
    protected Calculator calculator;

    @Before
    public void setUp(){
        System.out.println("Before test method.");
        calculator = new Calculator();
    }

    @BeforeClass
    public static void setUpClass(){
        System.out.println("BeforeClass method.");
    }

    @After
    public void tearDown(){
        System.out.println("After test method.");

    }

    @AfterClass
    public static void tesrDownClass(){
        System.out.println("AfterClass method.");
    }
}
