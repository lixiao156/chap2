package testone.bean;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

import static org.junit.Assert.*;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 9:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/demo.xml")
public class TestStudentTest {

    @Autowired
    @Qualifier("testStudent2")
    private TestStudent testStudent;

    @Test
    public void TestStudentTest() {
        System.out.println(testStudent.getName());
    }
}