package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.computer.Computer;
import be.multimedi.lessons.spring.events.LunchEvent;
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
import org.springframework.stereotype.Component;

import java.util.Random;

public class CleaningApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.getEnvironment().setActiveProfiles("smallHouse");
        ctx.refresh();

        ctx.start();

//        DomesticService service = ctx.getBean("vivian", DomesticService.class);
//        service.runHouseHold();
//        ctx.publishEvent(new LunchEvent());

        ctx.close();

    }
}
