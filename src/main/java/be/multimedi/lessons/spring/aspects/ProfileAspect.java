package be.multimedi.lessons.spring.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.logging.Logger;

@Component
@Aspect
public class ProfileAspect {
    @Autowired
    Logger logger;

    @Around("execution(* *.runHouseHold(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        LocalTime start = LocalTime.now();
        Object returnedValue = pjp.proceed();
        LocalTime end = LocalTime.now();
        Long timePassed = ChronoUnit.MILLIS.between(start, end);
        logger.info(timePassed.toString());
        return returnedValue;
    }
}
