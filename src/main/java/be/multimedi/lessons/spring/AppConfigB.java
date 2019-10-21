package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.cleaning.CleaningRobot;
import be.multimedi.lessons.spring.tools.CleaningTool;
import be.multimedi.lessons.spring.tools.cleaning.Broom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigB {
    @Bean
    public CleaningTool bearnice() {
        return new Broom();
    }
}
