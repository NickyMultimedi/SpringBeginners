package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;

public class Sponge implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("Sponging the Night away");
    }
}
