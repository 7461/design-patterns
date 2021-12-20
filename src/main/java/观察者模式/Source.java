package 观察者模式;

import java.util.List;

/**
 * @description:事件源
 * @author:guf
 * @createTime:2021/12/15 9:20
 */
public abstract class Source {
    ListenerChain listenerChain=new ListenerChain();
   public abstract void cry();
}
