import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng_group {

    @Test(groups = "group1")
    public void abc(){
        System.out.println("这里是abc");
    }

    @Test(groups = "group1")
    public void abc1(){
        System.out.println("这里是abc1");
    }

    @Test(groups = "group2")
    public void abc2(){
        System.out.println("这里是abc2");
    }

}
