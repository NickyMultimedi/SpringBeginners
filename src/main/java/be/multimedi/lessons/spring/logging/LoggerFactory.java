package be.multimedi.lessons.spring.logging;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LoggerFactory {

    @Bean
    public Logger logger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getClass().getName());
    }
}
