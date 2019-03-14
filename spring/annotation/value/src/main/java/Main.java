import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dmz
 * @date Create in 15:36 2019/3/3
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        MyConfig bean = applicationContext.getBean(MyConfig.class);
        System.out.println(bean.getName());
    }
}
