package com.how2java.test;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import com.how2java.pojo.Category;
// �Զ�װ�� 



// ʹ��@RunWith����Junit����
@RunWith(SpringJUnit4ClassRunner.class)
// ʹ��@ContextConfigurationע����ָ��xml�ļ�·��
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    Category c;

    // ʹ��@Testע��������Junit��Ԫ���ԣ��������Զ��壩
    @Test
    public void test(){
        System.out.println(c.getName());
    }
}