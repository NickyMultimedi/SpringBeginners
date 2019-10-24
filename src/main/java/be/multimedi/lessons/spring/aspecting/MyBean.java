package be.multimedi.lessons.spring.aspecting;

import org.springframework.stereotype.Component;

@Component("suzanne")
public class MyBean implements MyInterface {
    @Override
    public String sayHello(String name) {
        String message = String.format("Hello %s", name);
        System.out.println(message);
        return message;
    }

    @Override
    public String sayGoodbye(String name) {
        return String.format("Goodbye %s", name);
    }
}
