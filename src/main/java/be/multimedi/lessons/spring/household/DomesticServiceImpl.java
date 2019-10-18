package be.multimedi.lessons.spring.household;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("domesticService")
public class DomesticServiceImpl implements DomesticService {
    @Autowired GardeningService garden;
    @Autowired CleaningService cleaning;

    @Override
    public void runHouseHold() {
        System.out.println("Start Running the house Hold");
        garden.gardening();
        cleaning.clean();
    }

    public void setGardeningService(GardeningService garden) {
        this.garden = garden;
    }

    public void setCleaningService(CleaningService cleaning) {
        this.cleaning = cleaning;
    }

    public DomesticServiceImpl withGardeningService(GardeningService garden) {
        this.setGardeningService(garden);
        return this;
    }

    public DomesticServiceImpl withCleaningService(CleaningService cleaning) {
        this.setCleaningService(cleaning);
        return this;
    }
}
