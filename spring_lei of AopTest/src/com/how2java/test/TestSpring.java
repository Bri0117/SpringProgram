package com.how2java.test;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import com.how2java.pojo.Category;
// 自动装配 



// 使用@RunWith加载Junit驱动
@RunWith(SpringJUnit4ClassRunner.class)
// 使用@ContextConfiguration注解来指定xml文件路径
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    Category c;

    // 使用@Test注解来进行Junit单元测试（方法名自定义）
    @Test
    public void test(){
        System.out.println(c.getName());
    }
}