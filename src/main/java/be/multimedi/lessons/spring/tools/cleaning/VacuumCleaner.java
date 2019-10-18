package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;

public class VacuumCleaner implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("Zooooooeeeeeeeemmmmmmmmmm");
    }
}
