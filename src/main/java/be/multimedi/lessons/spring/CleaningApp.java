package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.household.DomesticService;
import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CleaningApp {
//    @Autowired
//    static CleaningService service;
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//        CleaningTool tool = ctx.getBean("broom", CleaningTool.class);
//        tool.doCleanJob();

        DomesticService service = ctx.getBean("domesticService", DomesticService.class);

        service.runHouseHold();

        ctx.close();

    }
}
