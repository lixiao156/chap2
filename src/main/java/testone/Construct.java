package testone;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/6 12:23
 */
public class Construct {
    private int anInt;

    public Construct(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public String toString() {
        return "Construct{" +
                "anInt=" + anInt +
                '}';
    }

    public int getAnInt() {
        return anInt;
    }
}
