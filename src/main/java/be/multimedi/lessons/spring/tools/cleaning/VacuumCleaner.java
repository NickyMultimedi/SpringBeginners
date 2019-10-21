package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
//@Qualifier("electric")
@Profile("bigHouse")
@Order(3)
public class VacuumCleaner implements CleaningTool {
    @Autowired
    Logger logger;

    @Override
    public void doCleanJob() {
        logger.info("Zooooooeeeeeeeemmmmmmmmmm");
    }
}
