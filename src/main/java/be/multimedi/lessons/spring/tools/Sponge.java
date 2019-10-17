package be.multimedi.lessons.spring.tools;

public class Sponge implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("Sponging the Night away");
    }
}
