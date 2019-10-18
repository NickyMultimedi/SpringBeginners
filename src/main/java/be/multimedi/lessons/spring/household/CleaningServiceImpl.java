package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.stereotype.Service;

@Service
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
