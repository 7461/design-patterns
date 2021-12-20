package 责任链模式.demo1;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/13 15:07
 */
public class StrFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        msg.str=msg.str.replace("好烦躁","好开心");
        return true;
    }
}
