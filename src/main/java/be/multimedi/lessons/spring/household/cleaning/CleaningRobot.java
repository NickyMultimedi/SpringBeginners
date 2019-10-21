package be.multimedi.lessons.spring.household.cleaning;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.logging.Logger;

@Component
@Profile("bigHouse")
//@Qualifier("robot")
public class CleaningRobot implements CleaningService {
    @Autowired
    @NonNull
    List<CleaningTool> tools;
    @Autowired
    Logger logger;

    public CleaningRobot(List<CleaningTool> tools, Logger logger) {
        logger.info("Constructor called by robot");
    }

    @PostConstruct
    public void init() {
        logger.info("Robot Service Post Contruct");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Before destroying the robot service");
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void clean() {
        logger.info("Starting up. Battery 100 percent. Lets go");
        tools.forEach(CleaningTool::doCleanJob);
        logger.info("shutting down, battery at 98 percent. What an efficient day");
    }
}
