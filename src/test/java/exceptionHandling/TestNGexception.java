package exceptionHandling;
import org.testng.annotations.Test;

public class TestNGexception {
    @Test(expectedExceptions = ArithmeticException.class)
    public void testNGexceptionHandling(){
        System.out.println("ExceptionHandled");
        int i = 1/0;
    }
}
