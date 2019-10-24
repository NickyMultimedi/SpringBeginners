package be.multimedi.lessons.spring.household.cleaning;

import be.multimedi.lessons.spring.events.LunchEvent;
import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.logging.Logger;

@Service("geoffrey")
//@Primary
@Profile("smallHouse")
public class CleaningServiceImpl implements CleaningService {
    private CleaningTool tool;
    private double rate;
    @Autowired Logger logger;

    public CleaningServiceImpl() {
        logger.info("Cleaning Service constructed");
    }

    @Override
    public void clean() {
        logger.info("Cleaning the House");
        tool.doCleanJob();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println("Belle must be here somewhere");
        }
        logger.info(String.format("The hourly rate for this service is %.2f euro", this.rate));
    }

    @EventListener(classes = LunchEvent.class)
    public void onLunchEvent() {
        logger.info("Lunch Time for the Cleaning crew");
    }

    @PostConstruct
    public void init() {
        logger.info("Cleaning Service Post Contruct");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Before destroying the Cleaning service");
    }

    @Value("${rate}")
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Autowired
    public void setCleaningTool(CleaningTool tool) {
        this.tool = tool;
    }
}
