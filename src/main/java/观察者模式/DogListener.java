package 观察者模式;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/15 9:54
 */
public class DogListener implements Listener{
    @Override
    public void doActionOnEvent(Event event) {
        System.out.println("child cry,dog 汪 汪 汪...");
    }
}
