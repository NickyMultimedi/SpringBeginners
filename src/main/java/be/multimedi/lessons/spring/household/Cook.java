package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.events.LunchEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Cook implements CookingService {
    final Logger logger;
    final ApplicationEventPublisher publisher;

    Cook(final Logger logger, final ApplicationEventPublisher publisher) {
        this.logger = logger;
        this.publisher = publisher;
    }

    @Override
    public void makeLunch() {
        logger.info("Preparing Lunch");
        try {
            Thread.sleep(1000);
            logger.info("Lunch is served!");
        } catch (InterruptedException ie) {
            logger.info("The kitchen is on Fire. Run");
        }
        publisher.publishEvent(new LunchEvent());
        logger.info("Cleaning up after the Lunch");
    }
}
