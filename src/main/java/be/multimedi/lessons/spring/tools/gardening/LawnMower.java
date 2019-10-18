package be.multimedi.lessons.spring.tools.gardening;

import be.multimedi.lessons.spring.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("noisy")
public class LawnMower implements GardeningTool {
    @Autowired
    Logger logger;

    @Override
    public void doGardenJob() {
        logger.info("Mowing the Lawn, Mowing the Lawn");
    }
}
