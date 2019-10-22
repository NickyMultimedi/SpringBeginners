package be.multimedi.lessons.spring.computer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Component
public class Computer {
    LocalDate purchaseDate;
    URL vendorURL;
    double price;
    long memory;
    String cpu;
    long processors;
    String ownerName;
    String os;
    List<String> features;

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    @Value("#{T(java.time.LocalDate).now()}")
    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public URL getVendorURL() {
        return vendorURL;
    }

    @Value("#{new java.net.URL('https://javaeewondelgem.be')}")
    public void setVendorURL(URL vendorURL) {
        this.vendorURL = vendorURL;
    }

    public double getPrice() {
        return price;
    }

    @Value("#{1300.65}")
    public void setPrice(double price) {
        this.price = price;
    }

    public long getMemory() {
        return memory;
    }

    @Value("#{T(Runtime).getRuntime().totalMemory()}")
    public void setMemory(long memory) {
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    @Value("#{T(Runtime).getRuntime().freeMemory()}")
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public long getProcessors() {
        return processors;
    }

    @Value("#{T(Runtime).getRuntime().availableProcessors()}")
    public void setProcessors(long processors) {
        this.processors = processors;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Value("#{systemProperties['user.name']}")
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOs() {
        return os;
    }

    @Value("#{systemProperties['os.name']}")
    public void setOs(String os) {
        this.os = os;
    }

    public List<String> getFeatures() {
        return features;
    }

    @Value("#{{'USBC', 'USBC', 'USBC', 'Firebolt3'}}")
    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "purchaseDate=" + purchaseDate +
                ", vendorURL=" + vendorURL +
                ", price=" + price +
                ", memory=" + memory +
                ", cpu='" + cpu + '\'' +
                ", processors=" + processors +
                ", ownerName='" + ownerName + '\'' +
                ", os='" + os + '\'' +
                ", features=" + features +
                '}';
    }
}
