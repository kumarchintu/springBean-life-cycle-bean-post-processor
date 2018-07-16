package org.inetsolv.SpringCoreLifeCycleTest;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class OurBeanPostProcessor implements BeanPostProcessor{

public Object postProcessBeforeInitialization(Object bean, String beanName){
	System.out.print("postProcessBeforeInit().... Get bean here:	");
	System.out.println(bean);
	return bean;
}

public Object postProcessAfterInitialization(Object bean, String beanName){
	System.out.print("postProcessAfterInit()....Get beanName here:	");
	System.out.println(beanName);
	return bean;
}
}