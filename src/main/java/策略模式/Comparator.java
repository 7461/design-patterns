package 策略模式;

/**
 * @description:比较器
 * @author:guf
 * @createTime:2021/12/8 14:00
 */
public interface Comparator<T> {
    int comparTo(T o1, T o2);
}
