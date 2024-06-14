package ru.lfdy.spring.current;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Создаем контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext.xml");
       SimpleBean simpleBeanbean = context.getBean("simpleBean", SimpleBean.class);
       simpleBeanbean.doSomething();
       CodeCreator codeCreator = context.getBean("javaCodeCreator", CodeCreator.class);
        System.out.println(codeCreator.getClassExample());
        context.close();
    }
}
