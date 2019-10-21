package be.multimedi.lessons.spring.household;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Autowired Logger logger;

    @Override
    public void runHouseHold() {
        logger.info("running household");
        logger.info("Frank, do the garden");
        garden.gardening();
        logger.info("Geoffrey, do the house please");
        cleaning.clean();
        logger.info("done running the household. Geoffrey, get me a cocktail.");
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
