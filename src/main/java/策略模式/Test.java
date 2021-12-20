package 策略模式;

import java.util.Arrays;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/8 14:28
 */
public class Test {
    public static void main(String[] args) {
        Integer[] integers = {new Integer(1), new Integer(5), new Integer(3)};
        Object[] sort = SortUtil.sort(integers, (o1, o2) -> {
            if (o1 > 02) return 1;
            if (o1 < 02) return -1;
            return 0;
        });
        System.out.println(Arrays.asList(sort));
    }
}
