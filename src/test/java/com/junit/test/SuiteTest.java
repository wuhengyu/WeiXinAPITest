package com.junit.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/11 22:48
 * Description:测试套件
 */
//@RunWith(Suite.class)
//@Suite.SuiteClasses({
//        test.JunitTestExtends.class,
//        test.JunitTestExtends2.class
//})
@RunWith(JUnitPlatform.class)
@SelectPackages("com/junit/test")
//@SelectClasses(TestJunitExtends.class)
public class SuiteTest {

}
