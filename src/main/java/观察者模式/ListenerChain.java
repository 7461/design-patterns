package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:listener chain
 * @author:guf
 * @createTime:2021/12/15 13:54
 */
public class ListenerChain implements Listener {
    List<Listener> listeners=new ArrayList<>();
    @Override
    public void doActionOnEvent(Event event) {
        for (Listener listener:listeners){
            listener.doActionOnEvent(event);
        }
    }
}
