package 观察者模式;

import java.util.ArrayList;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/15 9:26
 */
public class Child extends Source {

    {
        listenerChain.listeners.add(new DogListener());
    }

    @Override
    public void cry() {
        System.out.println("child...cry...cry...cry...");
        listenerChain.doActionOnEvent(new CryEvent());
    }
}
