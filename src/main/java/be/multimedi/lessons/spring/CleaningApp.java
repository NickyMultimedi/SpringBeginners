package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.household.DomesticService;
import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CleaningApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        CleaningTool tool = ctx.getBean("broom2", CleaningTool.class);
        tool.doCleanJob();

        ctx.close();

    }
}
