package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cleaningService")
public class CleaningServiceImpl implements CleaningService {
    private CleaningTool tool;

    @Override
    public void clean() {
        System.out.println("Cleaning the House");
        tool.doCleanJob();
    }

    @Autowired
    public void setCleaningTool(@Qualifier("broomie") CleaningTool tool) {
        this.tool = tool;
    }
}
