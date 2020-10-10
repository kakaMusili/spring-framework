package com.kamutech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

        Car vehicleI= (Car) applicationContext.getBean("car");

        vehicleI.drive();

        /*Tyre t= (Tyre)applicationContext.getBean("tyre");

        System.out.println(t);*/
       // t.toString();
    }
}
