package ru.lfdy.spring.current;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
            /*
            <bean id ="javaCodeCreator" class = "ru.lfdy.spring.current.JavaCodeCreator">
    <property name="classNameGenerator">
       <ref bean="animalsClassNameGenerator"/>
    </property>
</bean>

<bean id ="simpleBean" class="ru.lfdy.spring.current.SimpleBean " scope="prototype"/>

         */
    @Bean
    public SimpleBean simpleBean (){
         SimpleBean simpleBean = new SimpleBean();
         return simpleBean;

    }
}
