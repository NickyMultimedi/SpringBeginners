package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.household.CleaningToolMock;
import be.multimedi.lessons.spring.household.cleaning.CleaningServiceImpl;
import be.multimedi.lessons.spring.logging.LoggerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Configuration
@PropertySource("classpath:application.properties")
@Import(LoggerFactory.class)
public class TestConfig {

    @Bean
    public CleaningToolMock mock() {
        return new CleaningToolMock();
    }

    @Bean
    public CleaningService testCleaner() {
        return new CleaningServiceImpl();
    }
}
