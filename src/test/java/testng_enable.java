import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng_enable {

    @Test(enabled = false)
    public void abc(){
        System.out.println("这里是abc");
    }

    @Test
    public void abc1(){
        System.out.println("这里是abc1");
    }

    @Test
    public void abc2(){
        System.out.println("这里是abc2");
    }

}
