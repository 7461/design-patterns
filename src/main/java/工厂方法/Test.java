package 工厂方法;

/**
 * @description:
 * @author:guf  可以随便的添加其他品牌的电脑
 * @createTime:2021/12/9 10:29
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new ComputerFactory() {
            @Override
            public Computer create() {
                return new HuaWeiComputer();
            }
        }.create();
    }
}
