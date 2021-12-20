package 责任链模式.demo2;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/13 15:56
 */
public interface Filter {
    boolean doFilter(Request request , Response response,FilterChain filterChain);
}
