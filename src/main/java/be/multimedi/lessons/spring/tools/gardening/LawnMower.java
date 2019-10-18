package be.multimedi.lessons.spring.tools.gardening;

import be.multimedi.lessons.spring.tools.GardeningTool;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LawnMower implements GardeningTool {
    @Override
    public void doGardenJob() {
        System.out.println("Mowing the Lawn, Mowing the Lawn");
    }
}
