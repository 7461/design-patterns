package 抽象工厂;

/**
 * @description:产品生产工厂
 * @author:guf
 * @createTime:2021/12/9 10:44
 */
public abstract class ProductFactory {
    abstract Computer createComputer();

    abstract KeyBoard createKeyBoard();

    abstract Mouse createMouse();
}
