import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class rest_assured {
//    @Test
//    public void getfunction1() throws Exception {
//
//        //结构验证
//        get("https://testerhome.com/api/v3/topics.json?limit=1&offset=0&type=last_actived")
//                .prettyPeek();
//    }
//
//    @Test
//    public void getfunction2() throws Exception {
//        Response response =
//                given().param("limit", 2).and().param("offset", 0).and()
//                .param("type", "last_actived").cookie().header().contentType()
//                .get("https://testerhome.com/api/v3/topics.json");
////        response.getCookies();
////        response.getContentType();
//        Assert.assertEquals(200,response.statusCode());
//

//    }
//    @Test
//    public void getfunction3() throws Exception {
//
//
//        Map<String, Object> parameters = new HashMap<String, Object>();
//        parameters.put("limit", 2);
//        parameters.put("offset", 0);
//        parameters.put("type", "last_actived");
//
//        int statuscode = given().params(parameters).get("https://testerhome.com/api/v3/topics.json").getStatusCode();
//
//    }
//        @Test
//    public void postfunction2() throws Exception {
//        Response response =
//                given()
//                        .cookie("ll=\"108288\"; bid=ufm8svqInPI; __utmc=30149280; douban-fav-remind=1; gr_user_id=4171796e-842c-4c4a-90a0-26e6738a48d0; _vwo_uuid_v2=DCD0C06E626E1D6DFE13B60EAD6341A39|d72f1edb0d54ead74d312fdccc346905; __yadk_uid=D5htNM4K5N9sqGUCr3fbvz5kAD82ZqNh; push_noty_num=0; push_doumail_num=0; __utmv=30149280.4603; __utmz=30149280.1554109383.4.2.utmcsr=baidu|utmccn=(organic)|utmcmd=organic; ct=y; douban-profile-remind=1; _pk_ref.100001.8cb4=%5B%22%22%2C%22%22%2C1554861655%2C%22https%3A%2F%2Faccounts.douban.com%2Fpassport%2Flogin_popup%3Flogin_source%3Danony%22%5D; _pk_ses.100001.8cb4=*; __utma=30149280.526818714.1553674558.1554692810.1554861656.15; ap_v=0,6.0; dbcl2=\"46030598:tYoIujDGqDo\"; ck=aIY0; __utmt=1; _pk_id.100001.8cb4=159c3a6479396543.1553674557.12.1554862948.1554693410.; __utmb=30149280.14.10.1554861656")
//                        .contentType("application/x-www-form-urlencoded")
//                        .param("ck","aIY0")
//                        .param("comment","test0411")
//                .post("https://www.douban.com/");
////        response.getCookies();
////        response.getContentType();
//        Assert.assertEquals(200,response.statusCode());
//    }


    @Test
    public void postfunction3() throws Exception {


        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("ck", "aIY0");
        parameters.put("comment", "test0411");
//        parameters.put("type", "last_actived");

        int statuscode = given()
                .cookie("ll=\"108288\"; bid=ufm8svqInPI; __utmc=30149280; douban-fav-remind=1; gr_user_id=4171796e-842c-4c4a-90a0-26e6738a48d0; _vwo_uuid_v2=DCD0C06E626E1D6DFE13B60EAD6341A39|d72f1edb0d54ead74d312fdccc346905; __yadk_uid=D5htNM4K5N9sqGUCr3fbvz5kAD82ZqNh; push_noty_num=0; push_doumail_num=0; __utmv=30149280.4603; __utmz=30149280.1554109383.4.2.utmcsr=baidu|utmccn=(organic)|utmcmd=organic; ct=y; douban-profile-remind=1; _pk_ref.100001.8cb4=%5B%22%22%2C%22%22%2C1554861655%2C%22https%3A%2F%2Faccounts.douban.com%2Fpassport%2Flogin_popup%3Flogin_source%3Danony%22%5D; _pk_ses.100001.8cb4=*; __utma=30149280.526818714.1553674558.1554692810.1554861656.15; ap_v=0,6.0; dbcl2=\"46030598:tYoIujDGqDo\"; ck=aIY0; __utmt=1; _pk_id.100001.8cb4=159c3a6479396543.1553674557.12.1554862948.1554693410.; __utmb=30149280.14.10.1554861656")
                .contentType("application/x-www-form-urlencoded")
                .params(parameters).post("https://www.douban.com/").getStatusCode();

    }

    @Test
    public void assert_Test() throws Exception {

        //断言验证
        Response response = get("https://testerhome.com/api/v3/topics.json?limit=1&offset=0&type=last_actived");
        int statuscode = response.statusCode();
        Assert.assertEquals(200, statuscode, "接口返回正确");
        String title = response.jsonPath().getString("topics[0].title");
        Assert.assertEquals("QA 最佳实践：大厂如何提升软件质量？|福利",title,"标题正确");
        //获取topic数量
        int topicsize = response.jsonPath().getList("topics").size();
        Assert.assertEquals(3,topicsize,"topic sum = 3");

    }

    @Test
    public void assert_Test_topicsize() throws Exception {

        //断言验证
        Response response = get("https://testerhome.com/api/v3/topics.json?limit=1&offset=0&type=last_actived");

        //获取topic数量
        int topicsize = response.jsonPath().getList("topics").size();

        //提前构造
        List list = new ArrayList();
        list.add("QA 最佳实践：大厂如何提升软件质量？|福利");
        list.add("接口测试线下 Workshop 上海站");
        list.add("TesterHome 广州沙龙 2019年 第 1 期报名中！");
        for (int i=0;i<topicsize;i++) {
            Assert.assertEquals(
                    list.get(i), response.jsonPath().getString("topics[" + i + "].title"));
        }
    }

    @Test
    public void jsonscheme(){

        get("https://testerhome.com/api/v3/topics.json?limit=1&offset=0&type=last_actived")
                .then().assertThat().body(matchesJsonSchemaInClasspath("topics.json"));

    }

}
