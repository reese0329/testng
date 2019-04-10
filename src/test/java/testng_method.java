import org.testng.annotations.*;

public class testng_method {
//    运行每个测试方法进都会被执行到
    @BeforeMethod
    public void BeforeMethod(){
    System.out.println("BeforeMethod被运行");
}

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod被运行");
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
