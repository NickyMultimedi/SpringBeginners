package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.tools.CleaningTool;

public class CleaningServiceImpl implements CleaningService {
    private CleaningTool tool;

    @Override
    public void clean() {
        System.out.println("Cleaning the House");
        tool.doCleanJob();
    }

    public void setCleaningTool(CleaningTool tool) {
        this.tool = tool;
    }
}
