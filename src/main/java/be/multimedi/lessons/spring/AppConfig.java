package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.tools.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CleaningTool broom() {
        return new Broom();
    }

    @Bean
    public CleaningTool vacuum() {
        return new VacuumCleaner();
    }

    @Bean
    public CleaningTool sponge() {
        return new Sponge();
    }

    @Bean
    public CleaningService jill() {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(broom());
        return impl;
    }

    @Bean
    public CleaningService pommeline() {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(vacuum());
        return impl;
    }

    @Bean
    public CleaningService geoffrey() {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(sponge());
        return impl;
    }
}
