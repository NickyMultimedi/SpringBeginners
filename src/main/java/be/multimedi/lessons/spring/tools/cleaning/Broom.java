package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
//@Primary
//@Qualifier("swipe")
@Profile("bigHouse | smallHouse")
@Order(2)
public class Broom implements CleaningTool {
    @Autowired
    Logger logger;

    public Broom() {
//        logger.info("Constructing Broom");
    }

    public void init() {
        logger.info("Initializing Broom");
    }
    public void doCleanJob() {
        logger.info("Sweep sweep");
    }

    public void destroy() {
        logger.info("Destroy Broom");
    }
}
