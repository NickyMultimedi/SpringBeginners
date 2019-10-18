package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
@Qualifier("dust")
@Order(1)
public class DisposableDuster implements CleaningTool {
    private boolean used = false;
    @Autowired
    Logger logger;

    @Override
    public void doCleanJob() {
        if (used) {
            logger.info("Take a new one. I'm dirty");
        } else {
            logger.info("Swingend schoon met Swiffer");
            used = true;
        }
    }
}
