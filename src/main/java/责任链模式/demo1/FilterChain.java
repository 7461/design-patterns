package 责任链模式.demo1;

import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/13 14:25
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Msg msg) {
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
