package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.events.LunchEvent;
import be.multimedi.lessons.spring.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Service("frank")
public class GardeningServiceImpl implements GardeningService {
    @Autowired private GardeningTool tool;
    @Autowired
    Logger logger;

    @Override
    public void gardening() {
        logger.info("start Gardening");
        tool.doGardenJob();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println("Tools are moving by themselves.");
        }
        logger.info("done Gardening");
    }

    @EventListener
    public void onLunchEvent(LunchEvent lunch) {
        logger.info("Gardeners Unite en feast on this holy food.");
    }

    @PostConstruct
    public void init() {
        logger.info("Gardening Service Post Contruct");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Before destroying the Gardening service");
    }

    public void setGardeningTool(GardeningTool tool) {
        this.tool = tool;
    }
}
