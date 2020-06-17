package ExtConfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ExtUserRibbonConfig
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/18 1:57 AM
 * Version 1.0
 **/
@Configuration
public class ExtUserRibbonConfig {
    @Bean
    public IRule randomRule(){
        return new RoundRobinRule();
    }
}
