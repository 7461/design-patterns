package 代理模式.动态代理;
/**
 * @description:计算器
 * @author:guf
 * @createTime:2021/12/16 9:16
 */
public interface Calculator<T> {
    int sum(T t1,T t2);
}
