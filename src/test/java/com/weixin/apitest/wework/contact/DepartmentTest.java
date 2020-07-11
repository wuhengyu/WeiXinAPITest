package com.weixin.apitest.wework.contact;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

class DepartmentTest {

    static Department department;

    @BeforeAll
    static void setUp() {
        department = new Department();
    }

    @Disabled
    @Test
    void department_list() {

        department.department_list("32691").then().statusCode(200).body("department.name[0]", equalTo(
                "TestDepartment01"));
    }

    @Disabled
    @Test
    void department_create() {
        department.department_create("ChildTestDepartment2", "32692").then().statusCode(200).body("errmsg", equalTo(
                "created"));
    }

    @Disabled
    @Test
    void department_delete() {
        department.department_delete("32713").then().statusCode(200).body("errmsg", equalTo(
                "deleted"));
    }

    @Test
    void department_update() {
        department.department_update("32717", "更新部门2", "update2", "32692", "1").then().statusCode(200).body("errmsg",
                equalTo(
                        "updated"));
    }
}