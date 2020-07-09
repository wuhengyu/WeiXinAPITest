package com.weixin.apitest.wework.contact;

import com.jayway.jsonpath.JsonPath;
import com.weixin.apitest.wework.GetToken;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/5 23:57
 * Description:
 */
public class Department {

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

    public Response department_create(String name, String parentid) {
        String body = JsonPath.parse(this.getClass().getResourceAsStream("/data/department_create.json"))
                .set("$.name", name)
                .set("parentid", parentid).jsonString();
        return given()
                .queryParam("access_token", GetToken.getToken())
                .contentType("application/json")
                .log().all()
//                .body("{\n" +
//                        "   \"name\": \"" + name + "\",\n" +
//                        "   \"parentid\": " + parentid + ",\n" +
//                        "   \"order\": 0\n" +
//                        "}")
                .body(body)
                .when()
                .post("https://qyapi.weixin.qq.com/cgi-bin/department/create")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response();


    }
}


