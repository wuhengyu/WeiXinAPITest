package com.weixin.apitest.wework.contact;

import com.jayway.jsonpath.JsonPath;
import com.weixin.apitest.wework.GetTokenClass;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/5 23:57
 * Description:
 */
public class Department {
    //    @Test
    public Response department_list(String id) {
        return given()
                .log().all()
                .param("access_token", GetTokenClass.returnGetToken())
                .param("id", id)
                .when()
                .get("https://qyapi.weixin.qq.com/cgi-bin/department/list")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response();
    }

    //    @Disabled
//    @Test
    public Response department_create(String name, String parentid) {
        String body = JsonPath.parse(this.getClass().getResourceAsStream("/data/department_create.json"))
                .set("$.name", name)
                .set("parentid", parentid).jsonString();
        return given()
                .queryParam("access_token", GetTokenClass.returnGetToken())
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

    //    @Disabled
//    @Test
    public Response department_delete(String id) {
        return given().log().all()
                .param("access_token", GetTokenClass.returnGetToken())
                .param("id", id)
                .when().get("https://qyapi.weixin.qq.com/cgi-bin/department/delete")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response();
    }

    //    @Test
    public Response department_update(String id, String name, String name_en, String parentid, String order) {
        String body = JsonPath.parse(this.getClass().getResourceAsStream("/data/department_update.json"))
                .set("access_token", GetTokenClass.returnGetToken())
                .set("id", id)
                .set("name", name)
                .set("name_en", name_en)
                .set("parentid", parentid)
                .set("order", order).jsonString();
        return given()
                .queryParam("access_token", GetTokenClass.returnGetToken())
                .contentType("application/json")
                .log().all()
                .body(body)
                .when()
                .post("https://qyapi.weixin.qq.com/cgi-bin/department/update")
                .then().log().all()
                .statusCode(200)
                .extract()
                .response();
    }
}


