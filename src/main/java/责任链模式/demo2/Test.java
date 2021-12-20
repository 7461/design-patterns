package 责任链模式.demo2;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/13 15:27
 */
public class Test {
    public static void main(String[] strings) {
        FilterChain filterChain=new FilterChain();
        filterChain.add(new HTMLFilter());
        Request request = new Request("<好烦躁，996");
        Response response = new Response();
        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}
