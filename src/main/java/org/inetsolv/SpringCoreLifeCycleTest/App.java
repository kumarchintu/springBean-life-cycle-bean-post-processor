package org.inetsolv.SpringCoreLifeCycleTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
    	container.getBean(OurBeanPostProcessor.class);
    	((AbstractApplicationContext)container).close();			
    }
}