package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.tools.GardeningTool;

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
