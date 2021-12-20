package 代理模式.静态代理;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/16 9:24
 */
public class IntCaluclator implements Calculator<Integer> {
    @Override
    public int sum(Integer t1, Integer t2) {
        int sum = t1 + t2;
        System.out.println(sum);
        return sum;
    }
}
