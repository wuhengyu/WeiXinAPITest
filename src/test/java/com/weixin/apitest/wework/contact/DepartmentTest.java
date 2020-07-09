package com.weixin.apitest.wework.contact;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

class DepartmentTest {

    static Department department;

    @BeforeAll
    static void setUp() {
        department = new Department();
    }

    @Test
    void list() {

        department.department_list("32691").then().statusCode(200).body("department.name[0]", equalTo(
                "TestDepartment01"));
    }

    @Test
    void department_create() {
        department.department_create("ChildTestDepartment08", "32691").then().statusCode(200).body("errmsg", equalTo(
                "created"));
    }
}