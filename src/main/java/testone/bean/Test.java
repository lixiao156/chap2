package testone.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 9:45
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/demo.xml");
//        String path = "demo.xml";
//        context.setConfigLocation(path);
//        context.refresh();
      TestStudent student  =  (TestStudent) context.getBean("testStudent2");
        System.out.println(student.getName());
    }
}
