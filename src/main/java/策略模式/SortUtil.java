package 策略模式;

/**
 * @description:排序工具类
 * @author:guf
 * @createTime:2021/12/8 13:56
 */
public class SortUtil {
    public static <T> Object[] sort(T[] arr,Comparator<T> comparator) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (comparator.comparTo(arr[j],arr[j+1])>0) {        // 相邻元素两两对比
                    T temp = arr[j+1];        // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
