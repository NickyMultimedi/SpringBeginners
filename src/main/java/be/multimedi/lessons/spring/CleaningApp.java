package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.household.DomesticService;
import be.multimedi.lessons.spring.tools.CleaningTool;
import be.multimedi.lessons.spring.tools.cleaning.Broom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class CleaningApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext();

        Random r = ctx.getBean(Random.class);

        System.out.println(r.nextInt());
        CleaningTool broom = ctx.getBean("bearnice", CleaningTool.class);

//        DomesticService service = ctx.getBean("vivian", DomesticService.class);

//        service.runHouseHold();

        ctx.close();

    }
}
