package 责任链模式.demo2;


import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/13 14:25
 */
public class FilterChain implements Filter {
    public List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Request request, Response response,FilterChain filterChain) {
        if (index >= filters.size()) {
            return true;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response,filterChain);

        return true;
    }
}
