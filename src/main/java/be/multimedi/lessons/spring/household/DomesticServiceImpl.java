package be.multimedi.lessons.spring.household;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Service("vivian")
public class DomesticServiceImpl implements DomesticService {
    @Autowired GardeningService garden;
    @Autowired
//    @Qualifier("robot")
    CleaningService cleaning;
    @Autowired CookingService cook;
    @Autowired Logger logger;

    @Override
    @EventListener(ContextStartedEvent.class)
    public void runHouseHold() {
        Thread cookingThread = new Thread(() -> cook.makeLunch());
        cookingThread.setDaemon(false);

        logger.info("running household");
        logger.info("Frank, do the garden");
        Thread gardeningThread = new Thread(() -> garden.gardening());
        gardeningThread.setDaemon(false);

        logger.info("Geoffrey, do the house please");
        Thread cleaningThread = new Thread(() -> cleaning.clean());
        cleaningThread.setDaemon(false);

        logger.info("done running the household. Geoffrey, get me a cocktail.");
        cookingThread.start();
        gardeningThread.start();
        cleaningThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {

        }

    }

    @PostConstruct
    public void init() {
        logger.info("Domestic Service Post Contruct");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Before destroying the Domestic service");
    }
}
