package 抽象工厂;

import 工厂方法.ComputerFactory;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/9 10:52
 */
public class Test {
    public static void  main(String[] args){
        ProductFactory computerFactory=new HuaWeiProductFactory();
    }
}
