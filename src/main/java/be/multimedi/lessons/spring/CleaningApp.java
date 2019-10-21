package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.household.DomesticService;
import be.multimedi.lessons.spring.sayhello.Hello;
import be.multimedi.lessons.spring.tools.CleaningTool;
import be.multimedi.lessons.spring.tools.cleaning.Broom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.util.Random;

public class CleaningApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.getEnvironment().setActiveProfiles("bigHouse");
        ctx.refresh();

        DomesticService s = ctx.getBean("vivian", DomesticService.class);

        s.runHouseHold();

        ctx.close();

    }
}
