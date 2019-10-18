package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gardeningService")
public class GardeningServiceImpl implements GardeningService {
    @Autowired private GardeningTool tool;

    @Override
    public void gardening() {
        tool.doGardenJob();
    }

    public void setGardeningTool(GardeningTool tool) {
        this.tool = tool;
    }
}
