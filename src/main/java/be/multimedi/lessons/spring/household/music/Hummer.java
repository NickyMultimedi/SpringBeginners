package be.multimedi.lessons.spring.household.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Hummer implements MusicMaker {
    private static final String HUM = "Hmmmm Hmmmm Hmmmmmmmmmmmmm Yeah Yeah Hmmmmmm";

    @Autowired
    Logger logger;

    @Override
    public void makeMusic() {
//        logger.info(HUM);
        System.out.println(HUM);
    }

}
