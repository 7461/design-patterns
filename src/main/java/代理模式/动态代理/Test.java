package 代理模式.动态代理;

import sun.rmi.runtime.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/16 9:52
 */
public class Test {
    public static void main(String[] args){
        IntCaluclator intCaluclator = new IntCaluclator();
        Calculator o = (Calculator)Proxy.newProxyInstance(Calculator.class.getClassLoader(), new Class[]{Calculator.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("log start....");
                Object invoke = method.invoke(intCaluclator, args);
                System.out.println("log end...");
                return invoke;
            }
        });
        int sum = o.sum(1, 2);
    }
}
