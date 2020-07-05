import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

/**
 * @Auther: 吴恒宇
 * @Date: 2020/7/5 22:56
 * @Description:
 */
public class GetToken {
    @Test
    public void getToken() {
        RestAssured
                .given()
                .queryParam("corpid", "ww31bfd58a477a8853")
                .queryParam("corpsecret", "N0tWmQ04esjpniiqmbmKAjA7vmyX2Lms0CM1NGOBin0")
                .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRET")
                .then()
                .log()
                .all()
                .body("errcode", equalTo(0));
    }

}
