package be.multimedi.lessons.spring.sayhello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements Hello {
    @Value("${username}")
    private String name;

    @Override
    public String sayHello() {
        return "Hello " + name;
    }
}
