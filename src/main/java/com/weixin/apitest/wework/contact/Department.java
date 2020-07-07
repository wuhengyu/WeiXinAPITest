package com.weixin.apitest.wework.contact;

import com.weixin.apitest.wework.GetToken;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/5 23:57
 * Description:
 */
public class Department {
//    public Response list(String name,String parentid){
//        List<String> values = new ArrayList<String>();
//        values.add(GetToken.getToken());
//        values.add(name);
//        values.add(parentid);
//        return given().log().all()
//                .body(values)
//                .when()
//                .post("https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token=ACCESS_TOKEN")
//                .then().log().all()
//                .statusCode(200)
//                .extract()
//                .response();
//    }

    public Response department_list(String id) {
        return given()
                .log().all()
                .param("access_token", GetToken.getToken())
                .param("id", id)
                .when()
                .get("https://qyapi.weixin.qq.com/cgi-bin/department/list")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response();
    }
}


