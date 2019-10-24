package be.multimedi.lessons.spring.aspects;

import be.multimedi.lessons.spring.household.music.MusicMaker;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MusicAspect {
    @DeclareParents(value = "be.multimedi.lessons.spring.household.DomesticServiceImpl", defaultImpl = be.multimedi.lessons.spring.household.music.Hummer.class)
    public static MusicMaker music;
}
