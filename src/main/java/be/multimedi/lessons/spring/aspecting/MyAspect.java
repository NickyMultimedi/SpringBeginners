package be.multimedi.lessons.spring.aspecting;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("execution(* *.sayHello(..))")
    public void before() {
        System.out.println("Before Hello");
    }

    @After("execution(* *.sayHello(..))")
    public void after() {
        System.out.println("After Hello");
    }

    @AfterReturning("execution(* *.sayHello(..))")
    public void afterReturning() {
        System.out.println("After returning Hello");
    }

    @AfterThrowing("execution(* *.sayHello(..))")
    public void afterThrowing() {
        System.out.println("After Throwing Hello");
    }
}
