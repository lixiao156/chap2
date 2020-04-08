package testone.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/7 22:58
 */
@Component

public class TestBean {

    int anInt;
    String string;
    private TestStudent testStudent;
    @Autowired
    public TestBean() {
    }
   @Autowired
    public TestBean(int anInt, String string, TestStudent testStudent) {
        this.anInt = anInt;
        this.string = string;
        this.testStudent = testStudent;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public TestStudent getTestStudent() {
        return testStudent;
    }

    public void setTestStudent(TestStudent testStudent) {
        this.testStudent = testStudent;
    }
}
