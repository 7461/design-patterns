package 代理模式.静态代理;

/**
 * @description:时间代理
 * @author:guf
 * @createTime:2021/12/16 9:40
 */
public class TimeProxy extends CalculateUtil {
    CalculateUtil calculateUtil;

    public TimeProxy(CalculateUtil calculateUtil) {
        this.calculateUtil = calculateUtil;
    }

    @Override
    public <T> Object sum(T i1, T i2, Calculator calculator) {
        long start = System.currentTimeMillis();
        Object sum = calculateUtil.sum(i1, i2, calculator);
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end-start));
        return sum;
    }
}
