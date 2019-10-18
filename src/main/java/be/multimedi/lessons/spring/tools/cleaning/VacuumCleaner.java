package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.stereotype.Component;

@Component
public class VacuumCleaner implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("Zooooooeeeeeeeemmmmmmmmmm");
    }
}
