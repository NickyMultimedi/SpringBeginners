package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DisposableDuster implements CleaningTool {
    private boolean used = false;

    @Override
    public void doCleanJob() {
        if (used) {
            System.out.println("Take a new one. I'm dirty");
        } else {
            System.out.println("Swingend schoon met Swiffer");
            used = true;
        }
    }
}
