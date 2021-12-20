package 责任链模式.demo1;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/13 14:12
 */
public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        msg.str=msg.str.replace("<","");
        return false;
    }
}
