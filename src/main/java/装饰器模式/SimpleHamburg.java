package 装饰器模式;

/**
 * @description:基础汉堡包
 * @author:guf
 * @createTime:2021/12/10 9:15
 */
public class SimpleHamburg  extends Hamburg{
    {
        desc="基础汉堡包";
    }
    @Override
    public void printHamburg() {
        System.out.println(desc);
    }
}
