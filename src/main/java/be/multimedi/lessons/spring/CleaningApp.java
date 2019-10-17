package be.multimedi.lessons.spring;

import be.multimedi.lessons.spring.tools.Broom;
import be.multimedi.lessons.spring.tools.CleaningTool;
import be.multimedi.lessons.spring.tools.VacuumCleaner;

public class CleaningApp {
    public static void main(String[] args) {
        CleaningTool broom = new Broom();
        CleaningTool vacuum =  new VacuumCleaner();
        CleaningServiceImpl service = new CleaningServiceImpl();

        service.setCleaningTool(broom);
        service.clean();

        service.setCleaningTool(vacuum);
        service.clean();

    }
}
