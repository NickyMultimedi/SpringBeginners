package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.tools.CleaningTool;

public class CleaningToolMock  implements CleaningTool {
    boolean cleanCalled;

    @Override
    public void doCleanJob() {
        cleanCalled = true;
    }

    public boolean isCalled() {
        return cleanCalled;
    }
}
