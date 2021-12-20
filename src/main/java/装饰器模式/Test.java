package 装饰器模式;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/10 9:42
 */
public class Test {
    public static void main(String[] args){
        SimpleHamburg simpleHamburg=new SimpleHamburg();
        simpleHamburg.printHamburg();
        EggDecorate eggDecorate=new EggDecorate(simpleHamburg);
        eggDecorate.printHamburg();
        PorkTenderloinDecorate porkTenderloinDecorate=new PorkTenderloinDecorate(simpleHamburg);
        porkTenderloinDecorate.printHamburg();
    }
}
