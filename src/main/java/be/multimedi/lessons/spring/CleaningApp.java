package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.household.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CleaningApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        DomesticService service = ctx.getBean("aunt viv", DomesticService.class);
        service.runHouseHold();

        ctx.close();

    }
}
