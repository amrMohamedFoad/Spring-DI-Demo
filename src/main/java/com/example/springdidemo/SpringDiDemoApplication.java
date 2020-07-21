package com.example.springdidemo;

import com.example.springdidemo.controllers.ConstructorInjectedController;
import com.example.springdidemo.controllers.GetterInjectedController;
import com.example.springdidemo.controllers.MyController;
import com.example.springdidemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
