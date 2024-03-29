package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.*;
import be.multimedi.lessons.spring.tools.*;
import be.multimedi.lessons.spring.tools.cleaning.Broom;
import be.multimedi.lessons.spring.tools.cleaning.DisposableDuster;
import be.multimedi.lessons.spring.tools.cleaning.Sponge;
import be.multimedi.lessons.spring.tools.cleaning.VacuumCleaner;
import be.multimedi.lessons.spring.tools.gardening.LawnMower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
//@Import(AppConfigB.class)
public class AppConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("housekeeping");
        return messageSource;
    }
}
