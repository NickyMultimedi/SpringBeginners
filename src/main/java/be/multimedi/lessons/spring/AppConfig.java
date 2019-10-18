package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.*;
import be.multimedi.lessons.spring.tools.*;
import be.multimedi.lessons.spring.tools.cleaning.Broom;
import be.multimedi.lessons.spring.tools.cleaning.DisposableDuster;
import be.multimedi.lessons.spring.tools.cleaning.Sponge;
import be.multimedi.lessons.spring.tools.cleaning.VacuumCleaner;
import be.multimedi.lessons.spring.tools.gardening.LawnMower;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Primary
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
    @Primary
    public GardeningTool mower() {
        return new LawnMower();
    }

    @Bean
    public CleaningService jill(CleaningTool tool) {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(tool);
        return impl;
    }

    @Bean(name = {"pommeline", "pommeke", "pomtje"})
    public CleaningService pommeline(CleaningTool tool) {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(tool);
        return impl;
    }

    @Bean
    @Primary
    public CleaningService geoffrey() {
        CleaningServiceImpl impl = new CleaningServiceImpl();
        impl.setCleaningTool(vacuum());
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

    @Bean
    @Primary
    public GardeningService lars(GardeningTool tool) {
        GardeningServiceImpl gsi = new GardeningServiceImpl();
        gsi.setGardeningTool(tool);
        return gsi;
    }

    @Bean(name = {"vi", "viv", "aunt viv", "vivian", "madam"})
    @Primary
    public DomesticService vivian(GardeningService gardeningService, CleaningService cleaningService) {
        return new DomesticServiceImpl()
                .withGardeningService(gardeningService)
                .withCleaningService(cleaningService);
    }
}
