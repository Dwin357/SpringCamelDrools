//package io.github.dwin357.springCamel;
//
//import org.apache.camel.builder.RouteBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.stereotype.Component;
//
//@Component("autowiredBuilder")
//public class AutowiredRouteBuilder extends RouteBuilder {
//
//	@Autowired
//	private ApplicationContext applicationContext;
//	
//	@Override
//	public void configure() throws Exception {
//		from("file:/home/dwin/workspace/SpringCamelDrool/ballHopper")
//		  .process(applicationContext.getBean("beanProcessorImpl", BeanProcessor.class))
//		  .to("file:/home/dwin/workspace/SpringCamelDrool/bullsEye");
//
//	}
//
//}
