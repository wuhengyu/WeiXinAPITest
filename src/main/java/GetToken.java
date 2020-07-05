import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/5 22:56
 * Description:
 */
public class GetToken {
    @Test
    public String getToken() {
        return RestAssured
                .given()
                .queryParam("corpid", WeXinConfig.getInstance().corpid)
                .queryParam("corpsecret", WeXinConfig.getInstance().corpsecret)
                .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRET")
                .then()
                .log()
                .all()
                .body("errcode", equalTo(0))
                .extract()
                .path("access_token");
    }

}
