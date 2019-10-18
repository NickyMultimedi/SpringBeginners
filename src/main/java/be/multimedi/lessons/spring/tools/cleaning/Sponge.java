package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Qualifier("wet")
@Order(4)
public class Sponge implements CleaningTool {
    @Autowired
    Logger logger;

    @Override
    public void doCleanJob() {
        logger.info("Sponging the Night away");
    }
}
