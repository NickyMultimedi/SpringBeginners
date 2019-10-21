package be.multimedi.lessons.spring.tools.gardening;

import be.multimedi.lessons.spring.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.logging.Logger;

@Component
public class HedgeTrimmerFactory {
    @Autowired
    Logger logger;

    @Bean
//    @Primary
    @Profile("bigHouse")
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
    public GardeningTool hedgeTrimmer() {
        int hour = LocalTime.now().getHour();
        if (hour > 8 && hour < 18) {
            return () -> logger.info("Trimming electrically");
        } else {
            return () -> logger.info("Trimming manually");
        }
    }
}
