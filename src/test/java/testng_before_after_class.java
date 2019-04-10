import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng_before_after_class {

    //    运行testng_before_after_class类的时，会执行一次
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass被运行");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass被运行");
    }

    @Test
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
