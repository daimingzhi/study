import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author dmz
 * @date Create in 15:37 2019/3/3
 */
@Configuration
@PropertySource("classpath:application.properties")
@Data
public class MyConfig {
    @Value("#{person.name}")
    private String name;

    @Bean
    public Person person() {
        return new Person();
    }
}
