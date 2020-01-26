package testngTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {
    @Test
    @Parameters("browser")
    public void parameterizedTestngTest(String browser){
        if (browser.equals("firefox")){
            System.out.println("Open firefox");
        }else if (browser.equals("Chrome")){
            System.out.println("Open Chrome");
        }
    }
}
