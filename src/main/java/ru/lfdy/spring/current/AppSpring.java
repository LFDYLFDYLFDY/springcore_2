package ru.lfdy.spring.current;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
//      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleBean simpleBean  =  context.getBean("simpleBean", SimpleBean.class);
simpleBean.doSomething();

    }
}
