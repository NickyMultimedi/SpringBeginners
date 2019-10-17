package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.tools.Broom;
import be.multimedi.lessons.spring.tools.CleaningTool;
import be.multimedi.lessons.spring.tools.Sponge;
import be.multimedi.lessons.spring.tools.VacuumCleaner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CleaningApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        CleaningService jill = ctx.getBean("jill", CleaningService.class);
        CleaningService pommeline = ctx.getBean("pommeline", CleaningService.class);
        CleaningService geoffrey = ctx.getBean("geoffrey", CleaningService.class);

        jill.clean();
        pommeline.clean();
        geoffrey.clean();

        ctx.close();

    }
}
