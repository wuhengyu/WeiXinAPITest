package com.junit.test;

import org.junit.jupiter.api.*;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/11 19:10
 * Description:
 */
public class JunitTest {
    @BeforeAll
    public static void BeforeAllClass_fu() {
        System.out.println("父类的@BeforeAllClass_fu");
    }

    @AfterAll
    public static void AfterAllClass_fu() {
        System.out.println("父类的@AfterAllClass_fu");
    }

    @BeforeEach
    public void BeforeEach_fu() {
        System.out.println("父类的@BeforeEach_fu");
    }

    @AfterEach
    public void AfterEach_fu() {
        System.out.println("父类的@AfterEach_fu");
    }

    @Test
    public void test01_fu() {
        System.out.println("test01_fu");
    }

    @Test
    public void test03_fu() {
        System.out.println("test03_fu");
    }

    @Test
    public void test02_fu() {
        System.out.println("test02_fu");
    }

    @Test
    public void test05_fu() {
        System.out.println("test05_fu");
    }

    @Test
    public void test04_fu() {
        System.out.println("test04_fu");
    }
}
