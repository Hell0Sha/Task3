package calculator.Trigonometric;

import org.testng.annotations.Factory;

public class GeometricFactory {
    @Factory
    public static Object [] GeomDataProvider(){
        return new Object[]{
                new TgTest(0.0, Math.tanh(0.0)),
                new TgTest(45.0, Math.tanh(45)),
                new TgTest(180.0, Math.tanh(180)),

                new CtgTest(45, 1/Math.tanh(45)),
                new CtgTest(0, 1/Math.tanh(0)),
                new CtgTest(90, 1/Math.tanh(90)),

                new SinTest(30, Math.sin(30)),
                new SinTest(0, Math.sin(0)),
                new SinTest(270, Math.sin(270)),

                new CosTest(0.0, Math.cos(0)),
                new CosTest(90.0, Math.cos(90) ),
                new CosTest(45.0, Math.cos(45)),


        };
    }
}
