package testone;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import testone.bean.TestComp;

import static org.junit.Assert.*;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 8:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/soundsystem.xml")
public class TestConstructTest {

    private TestComp testComp;
    public void test(){
    testComp.getAnInt();
}

}
