package 责任链模式.demo2;

import 责任链模式.demo1.Msg;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/13 14:12
 */
public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response,FilterChain filterChain) {
        request.str=request.str.replace("<","");
        filterChain.doFilter(request,response,filterChain);
        response.str="995";
        return true;
    }
}
