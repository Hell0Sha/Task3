package calculator;

import com.epam.tat.module4.Calculator;
import org.omg.CORBA.Object;
import org.testng.annotations.*;

import java.util.Date;

/**
 * Created by Alena_Shaadt on 1/29/2018.
 */
public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setUpClass(){
        calculator = new Calculator();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUpMethod(){
        System.out.println("Before method.");
    }

    @BeforeTest(alwaysRun = true)
    public void setUpTest(){
        System.out.println("Before test.");
    }

    @BeforeGroups(value = "test-group")
    public void setUpGroup(){
        System.out.println("Before group.");
    }

    @AfterGroups
    public void setDownGroup(){
        System.out.println("After group.");
    }

    @AfterTest(alwaysRun = true)
    public void setDownTest(){
        System.out.println("After test.");
    }

    @AfterMethod(alwaysRun = true)
    public void setDownMethod(){
        System.out.println("After method.");
    }

    @AfterClass(alwaysRun = true)
    public void setDownClass(){

        System.out.println("After class.");
    }

    protected void checkTime(){
        System.out.println("Current time" + new Date(System.currentTimeMillis()));
    }

    protected void validator(String a, String b, String c) {
        if (a.matches("\\d") && b.matches("\\d") && c.matches("\\d")) {
            long numA = Long.parseLong(a);
            long numB = Long.parseLong(b);
            long numC = Long.parseLong(c);
        } else if (a.matches("\\d+\\.\\d") && b.matches("\\d+\\.\\d") && c.matches("\\d+\\.\\d")){
            double na = Double.parseDouble(a);
            double nb = Double.parseDouble(b);
            double nc = Double.parseDouble(c);
        }
    }
}
