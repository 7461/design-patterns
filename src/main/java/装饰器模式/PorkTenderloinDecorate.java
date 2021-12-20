package 装饰器模式;

/**
 * @description:猪里脊装饰类
 * @author:guf
 * @createTime:2021/12/10 9:17
 */
public class PorkTenderloinDecorate extends Decorate {
    public PorkTenderloinDecorate(Hamburg hamburg) {
        this.hamburg = hamburg;
    }

    @Override
    public void addSubsidiary() {
        hamburg.desc = hamburg.desc + "+猪里脊";
    }

    @Override
    public void printHamburg() {
        addSubsidiary();
        System.out.println(hamburg.desc);
    }
}
