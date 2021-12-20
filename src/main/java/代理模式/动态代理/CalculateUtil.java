package 代理模式.动态代理;


/**
 * @description:
 * @author:guf
 * @createTime:2021/12/16 9:17
 */
public class CalculateUtil {
    public <T> Object sum(T i1, T i2, Calculator calculator) {
       return calculator.sum(i1,i2);
    }
}
