package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 9:08
 */
@Component
public class Pc implements MediaPlayer {
    int anInt;
    String name;

    @Autowired
    public Pc(int anInt, String name) {
        this.anInt = anInt;
        this.name = name;
    }

    @Autowired
    public Pc() {
    }


    public void play() {
        System.out.println("PC的视频处理器");
    }
}
