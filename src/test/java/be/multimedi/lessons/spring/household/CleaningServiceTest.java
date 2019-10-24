package be.multimedi.lessons.spring.household;

import be.multimedi.lessons.spring.TestConfig;
import be.multimedi.lessons.spring.household.cleaning.CleaningServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(TestConfig.class)
@TestPropertySource(properties = {"rate=10"})
class CleaningServiceTest {
    @Autowired
    CleaningService testCleaner;
    @Autowired
    CleaningToolMock mockTool;

    @Test
    public void testDoJob() {
        testCleaner.clean();
        assertTrue(mockTool.isCalled());
    }
}
