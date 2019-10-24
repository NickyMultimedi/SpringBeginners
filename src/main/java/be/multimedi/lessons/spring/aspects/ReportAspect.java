package be.multimedi.lessons.spring.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class ReportAspect {
    @Autowired
    Logger logger;

    @Before("execution(* *.runHouseHold(..))")
    public void beforeRunningHousehold() {
        logger.info("Before running the household");
    }

    @After("execution(* *.runHouseHold(..))")
    public void afterRunningHousehold() {
        logger.info("Done running the household");
    }
}
