package testone.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/7 23:08
 */
@Component
public class TestComp {

    private int anInt;

    private TestBean testBean;

    private TestStudent testStudent;
    @Autowired
    public TestComp() {
    }
    @Autowired
    public TestComp(int anInt) {
        this.anInt = anInt;
    }

    public TestComp(TestStudent testStudent) {
        this.testStudent = testStudent;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public TestBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }

    public TestStudent getTestStudent() {
        return testStudent;
    }

    public void setTestStudent(TestStudent testStudent) {
        this.testStudent = testStudent;
    }
}
