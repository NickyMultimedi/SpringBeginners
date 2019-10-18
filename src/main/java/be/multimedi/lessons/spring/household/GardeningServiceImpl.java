package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.tools.GardeningTool;
import org.springframework.stereotype.Service;

@Service
public class GardeningServiceImpl implements GardeningService {
    private GardeningTool tool;

    @Override
    public void gardening() {
        tool.doGardenJob();
    }

    public void setGardeningTool(GardeningTool tool) {
        this.tool = tool;
    }
}
