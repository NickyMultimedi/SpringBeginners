package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
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
        logger.info("done Gardening");
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
