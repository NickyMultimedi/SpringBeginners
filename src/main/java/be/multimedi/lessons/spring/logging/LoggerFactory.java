package be.multimedi.lessons.spring.logging;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LoggerFactory {
    @Bean
    @Scope("prototype")
    public Logger logger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getClass().getName());
    }
}
