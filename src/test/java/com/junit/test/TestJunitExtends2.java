package com.junit.test;

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
public class TestJunitExtends2 extends JunitTest {
    @BeforeAll
    public static void BeforeAllClass_zi2() {
        System.out.println("子类的@BeforeAllClass_zi2");
    }

    @AfterAll
    public static void AfterAllClass_zi2() {
        System.out.println("子类的@AfterAllClass_zi2");
    }

    @BeforeEach
    public void BeforeEach_zi2() {
        System.out.println("子类的@BeforeEach_zi2");
    }

    @AfterEach
    public void AfterEach_zi2() {
        System.out.println("子类的@AfterEach_zi2");
    }

    @Test
    public void test01_zi2() {
        System.out.println("test01_zi2");
    }

    @Test
    public void test03_zi2() {
        System.out.println("test03_zi2");
    }

    @Test
    public void test02_zi2() {
        System.out.println("test02_zi2");
    }

    @Test
    public void test05_zi2() {
        System.out.println("test05_zi2");
    }

    @Test
    public void test04_zi2() {
        System.out.println("test04_zi2");
    }
}
