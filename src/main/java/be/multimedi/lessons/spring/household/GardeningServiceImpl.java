package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void setGardeningTool(GardeningTool tool) {
        this.tool = tool;
    }
}
