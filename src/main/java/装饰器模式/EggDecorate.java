package 装饰器模式;

/**
 * @description:鸡蛋装饰器类
 * @author:guf
 * @createTime:2021/12/10 9:20
 */
public class EggDecorate extends Decorate {
    public EggDecorate(Hamburg hamburg) {
            this.hamburg=hamburg;
    }
    @Override
    public void addSubsidiary() {
        hamburg.desc = hamburg.desc + "+鸡蛋";
    }

    @Override
    public void printHamburg() {
        addSubsidiary();
        System.out.println(hamburg.desc);
    }
}
