package com.standalone_collection;

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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneconfig.xml");
        Person person = context.getBean("person",Person.class);
        System.out.println(person);
        System.out.println("Type : "+person.getClass().getName());
    }
}
