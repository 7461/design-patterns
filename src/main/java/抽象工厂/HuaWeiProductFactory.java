package 抽象工厂;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/9 10:47
 */
public class HuaWeiProductFactory extends ProductFactory {
    @Override
    Computer createComputer() {
        return new HuaWeiComputer();
    }

    @Override
    KeyBoard createKeyBoard() {
        return new HuaWeiKeyBoard();
    }

    @Override
    Mouse createMouse() {
        return new HuaWeiMouse();
    }
}
