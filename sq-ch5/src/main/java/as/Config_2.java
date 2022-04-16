package as;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Config_2 {

}
