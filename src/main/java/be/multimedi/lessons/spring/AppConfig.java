package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.tools.*;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
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
    @Scope(value="prototype", proxyMode = ScopedProxyMode.INTERFACES)
    public CleaningTool swiffer() {
        return new DisposableDuster();
    }

    @Bean
    public CleaningService jill() {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(broom());
        return impl;
    }

    @Bean(name = {"pommeline", "pommeke", "pomtje"})
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

    @Bean
    public CleaningService bagera() {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(swiffer());
        return impl;
    }

    @Bean
    public CleaningService bagheera() {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(swiffer());
        return impl;
    }
}
