package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.household.cleaning.CleaningServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CleaningServiceTest {
    CleaningServiceImpl testCleaner;
    CleaningToolMock mockTool;

    @BeforeEach
    public void before() {
        mockTool = new CleaningToolMock();
        testCleaner = new CleaningServiceImpl();

        testCleaner.setCleaningTool(mockTool);
        testCleaner.init();
    }

    @AfterEach
    public void after() {
        testCleaner.destroy();
        testCleaner = null;
    }

    @Test
    public void testDoJob() {
        testCleaner.clean();
        assertTrue(mockTool.isCalled());
    }

}
