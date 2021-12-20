package 责任链模式.demo1;

/**
 * @description:filter
 * @author:guf
 * @createTime:2021/12/13 14:09
 */
public interface Filter {
    boolean doFilter(Msg msg);
}
