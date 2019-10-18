package be.multimedi.lessons.spring.tools;

public interface CleaningTool {
    void doCleanJob();
    default void init() {
        System.out.println("create");
    }
    default void destroy() {
        System.out.println("destroy");
    }
}
