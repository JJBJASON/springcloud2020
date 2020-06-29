import java.time.ZonedDateTime;

/**
 * @author jjb 2020/06/28 - 下午 2:25
 */
public class T2 {

    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now(); //默认时区
        System.out.println(zdt);

        //2020-06-28T14:27:25.116+08:00[Asia/Shanghai]
    }
}
