package be.multimedi.lessons.spring.tools.gardening;

import be.multimedi.lessons.spring.tools.GardeningTool;

public class LawnMower implements GardeningTool {
    @Override
    public void doGardenJob() {
        System.out.println("Mowing the Lawn, Mowing the Lawn");
    }
}
