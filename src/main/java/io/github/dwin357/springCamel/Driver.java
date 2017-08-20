//package io.github.dwin357.springCamel;
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Driver {
//
//	public static void main(String[] args) {
//		AbstractApplicationContext camelContext = 
//				new ClassPathXmlApplicationContext("/io/github/dwin357/camelSpring/camel-context.xml");
//
//		camelContext.start();
//		System.out.println("started app, will run for 1min");
//		try {
//			Thread.sleep(1 * 60 * 1000);
//		} catch(InterruptedException e) {
//			// ignore
//		}
//		System.out.println("stopping app");
//		camelContext.stop();
//		camelContext.close();
//		
//	}
//
//}
