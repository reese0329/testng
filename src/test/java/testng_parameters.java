import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_parameters {
    //参数化
    @Test
    @Parameters("username")
    public void function8(String test1) {
        System.out.println("name == " + test1);
    }
}