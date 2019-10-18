package be.multimedi.lessons.spring.household.cleaning;

import be.multimedi.lessons.spring.household.CleaningService;
import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service("geoffrey")
@Primary
public class CleaningServiceImpl implements CleaningService {
    private CleaningTool tool;
    private double rate;
    @Autowired Logger logger;

    @Override
    public void clean() {
        logger.info("Cleaning the House");
        tool.doCleanJob();
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
