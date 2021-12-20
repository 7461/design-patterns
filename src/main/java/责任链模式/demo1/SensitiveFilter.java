package 责任链模式.demo1;

/**
 * @description:敏感词
 * @author:guf
 * @createTime:2021/12/13 14:16
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        msg.str=msg.str.replace("996","965");
        return true;
    }
}
