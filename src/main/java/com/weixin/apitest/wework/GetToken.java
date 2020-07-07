package com.weixin.apitest.wework;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/5 22:56
 * Description:
 */
public class GetToken {
    public static String token;

    @Test
    public static String getToken() {
        return RestAssured
                .given().log().all()
                .queryParam("corpid", WeXinConfig.getInstance().corpid)
//                .queryParam("corpsecret", WeXinConfig.getInstance().corpsecret)
                .queryParam("corpsecret", WeXinConfig.getInstance().contact_secret)
                .when()
                .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then()
                .log()
                .all()
                .body("errcode", equalTo(0))
                .extract()
                .path("access_token");
    }

    public static String returnGetToken() {
        if (token == null) {
            token = getToken();
        }
        return token;
    }

}
