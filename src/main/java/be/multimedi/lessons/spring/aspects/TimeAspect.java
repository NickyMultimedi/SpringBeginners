package be.multimedi.lessons.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Aspect
public class TimeAspect {
    @Value("${vacuumAllowedStart}")
    int allowedStartTime;
    @Value("${vacuumAllowedEnd}")
    int allowedStopTime;

    @Before("execution(* be.multimedi.lessons.spring.tools.cleaning.VacuumCleaner.doCleanJob(..))")
    public void vacuumLimiter() {
        if (vacuumUsedDuringSilentHours()) {
            throw new RuntimeException("Using the vacuum now has led to you being fired on the spot.");
        }
    }

    private boolean vacuumUsedDuringSilentHours() {
        LocalTime now = LocalTime.now();
        int nowInHours = now.getHour();
        return beforeStartHour(nowInHours) || afterEndHour(nowInHours);
    }

    private boolean beforeStartHour(int hour) {
        return hour < allowedStartTime;
    }

    private boolean afterEndHour(int hour) {
        return hour >= allowedStopTime;
    }
}
