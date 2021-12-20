package 责任链模式.demo1;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/13 14:08
 */
public class Test {
    public static void main(String[] args) {
        Msg msg = new Msg("<好烦躁，996");
        FilterChain filterChain=new FilterChain();
        FilterChain filterChain2=new FilterChain();
        filterChain2.add(new StrFilter());
        filterChain.add(filterChain2);
        filterChain.add(new HTMLFilter());
        filterChain.add(new SensitiveFilter());
        filterChain.doFilter(msg);
        System.out.println(msg.str);
    }
}
