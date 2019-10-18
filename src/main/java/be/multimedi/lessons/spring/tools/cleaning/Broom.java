package be.multimedi.lessons.spring.tools.cleaning;

import be.multimedi.lessons.spring.tools.CleaningTool;

public class Broom implements CleaningTool {

    public Broom() {
        System.out.println("Constructing Broom");
    }

    public void init() {
        System.out.println("Initializing Broom");
    }
    public void doCleanJob() {
        System.out.println("Sweep sweep");
    }

    public void destroy() {
        System.out.println("Destroy Broom");
    }
}
