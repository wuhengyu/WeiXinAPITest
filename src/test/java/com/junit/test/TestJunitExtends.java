package com.junit.test;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.*;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/11 19:15
 * Description:
 */
//对测试方法进行数字排序
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//对它们进行字母数字排序
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
//伪随机地订购测试方法
//@TestMethodOrder(MethodOrderer.Random.class)
public class TestJunitExtends extends JunitTest {
    @BeforeAll
    public static void BeforeAllClass_zi() {
        System.out.println("子类的@BeforeAllClass_zi");
    }

    @AfterAll
    public static void AfterAllClass_zi() {
        System.out.println("子类的@AfterAllClass_zi");
    }

    @BeforeEach
    public void BeforeEach_zi() {
        System.out.println("子类的@BeforeEach_zi");
    }

    @AfterEach
    public void AfterEach_zi() {
        System.out.println("子类的@AfterEach_zi");
    }

    @Test
    public void test01_zi() {
        System.out.println("test01_zi");
    }

    @Test
    @Category(Prod.class)
    public void test03_zi() {
        System.out.println("test03_zi");
    }

    @Test
    @Tag("wuhengyu")
    public void test02_zi() {
        System.out.println("test02_zi");
    }

    @Test
    public void test05_zi() {
        System.out.println("test05_zi");
    }

    @Test
    public void test04_zi() {
        System.out.println("test04_zi");
    }

    @Test
    @Disabled("This is Disabled")
    @DisplayName("DisplayName")
    public void test06_zi() {
        System.out.println("test06_zi");
    }
}
