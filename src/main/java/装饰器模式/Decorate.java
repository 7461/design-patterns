package 装饰器模式;

/**
 * @description:装饰器类
 * @author:guf
 * @createTime:2021/12/10 9:16
 */
public abstract class Decorate extends Hamburg{
   Hamburg hamburg;
   public abstract void addSubsidiary();
   @Override
   public void printHamburg() {
      System.out.println(hamburg.desc);
   }
}
