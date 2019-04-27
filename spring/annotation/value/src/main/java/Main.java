import com.alibaba.fastjson.JSON;

import java.time.LocalDate;

/**
 * @author dmz
 * @date Create in 15:36 2019/3/3
 */
public class Main {
    public static void main(String[] args) {
////        Demo mock = mock(Demo.class);
////        mock.say("hello mock");
////        verify(mock,times(1)).say("hello mock");
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Test.class);
//        Test bean = applicationContext.getBean(Test.class);
//       // AsyncListenableTaskExecutor asyncListenableTaskExecutor = bean.asyncListenableTaskExecutor;
//        System.out.println(1);
////        System.out.println(bean.getName());

        LocalDate date = LocalDate.now();

        String s = JSON.toJSONString(date);
        System.out.println(s);

    }
}
