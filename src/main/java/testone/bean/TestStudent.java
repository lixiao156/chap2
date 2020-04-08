package testone.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/7 22:59
 */
public class TestStudent {
    int id;
    String name;

    public TestStudent(String name) {
        this.name = name;
    }

    public TestStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public TestStudent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
