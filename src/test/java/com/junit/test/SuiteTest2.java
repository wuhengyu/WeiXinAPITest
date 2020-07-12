package com.junit.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/11 22:48
 * Description:测试套件
 */

@RunWith(JUnitPlatform.class)
@SelectClasses(TestJunitExtends.class)
//@ExcludeTags("wuhengyu")
@IncludeTags("wuhengyu")
public class SuiteTest2 {

}
