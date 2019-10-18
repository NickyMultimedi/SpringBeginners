package be.multimedi.lessons.spring.household.cleaning;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
@Qualifier("robot")
public class CleaningRobot implements CleaningService {
    @Autowired
    @NonNull
    List<CleaningTool> tools;
    @Autowired
    Logger logger;

    @Override
    public void clean() {
        logger.info("Starting up. Battery 100 percent. Lets go");
        tools.forEach(CleaningTool::doCleanJob);
        logger.info("shutting down, battery at 98 percent. What an efficient day");
    }
}
