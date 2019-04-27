import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncListenableTaskExecutor;

/**
 * @author dmz
 * @date Create in 20:03 2019/3/14
 */
@Configuration
@Data
public class Test implements BeanNameAware, BeanPostProcessor {

    @Autowired
    AsyncListenableTaskExecutor asyncListenableTaskExecutor;

    public Test() {
        System.out.println();
        System.out.println("构造函数初始化");
    }

    public void setBeanName(String s) {
        System.out.println(s);
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public void syn() {
        asyncListenableTaskExecutor.submit(() -> {
            System.out.println(123);
        });
    }
}
