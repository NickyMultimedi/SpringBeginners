package be.multimedi.lessons.spring.household.cleaning;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.logging.Logger;

@Service("geoffrey")
@Primary
public class CleaningServiceImpl implements CleaningService {
    private CleaningTool tool;
    private double rate;
    @Autowired Logger logger;

    public CleaningServiceImpl(Logger logger) {
        logger.info("Cleaning Service constructed");
    }

    @Override
    public void clean() {
        logger.info("Cleaning the House");
        tool.doCleanJob();
    }

    @PostConstruct
    public void init() {
        logger.info("Cleaning Service Post Contruct");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Before destroying the Cleaning service");
    }

    @Value("9")
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Autowired
    public void setCleaningTool(@Qualifier("broom") CleaningTool tool) {
        this.tool = tool;
    }
}
