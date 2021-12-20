package 代理模式.静态代理;

import sun.rmi.runtime.Log;

/**
 * @description:代理类
 * @author:guf
 * @createTime:2021/12/16 9:30
 */
public class LogProxy extends CalculateUtil{
    CalculateUtil calculateUtil;

    public LogProxy(CalculateUtil calculateUtil) {
        this.calculateUtil = calculateUtil;
    }

    @Override
    public <T> Object sum(T i1, T i2, Calculator calculator) {
        System.out.println("log start...");
        Object sum = calculateUtil.sum(i1, i2, calculator);
        System.out.println("log stop...");
        return sum;
    }
}
