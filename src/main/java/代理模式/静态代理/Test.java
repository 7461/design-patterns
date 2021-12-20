package 代理模式.静态代理;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/16 9:22
 */
public class Test {
    public static void main(String[] args) {
        CalculateUtil calculateUtil = new CalculateUtil();
        LogProxy logProxy = new LogProxy(calculateUtil);
        TimeProxy timeProxy = new TimeProxy(logProxy);
        Object sum = timeProxy.sum(1, 2, new IntCaluclator());
    }
}
