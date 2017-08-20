//package io.github.dwin357.springDrools;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import io.github.dwin357.models.Position;
//import io.github.dwin357.models.PositionFactory;
//
//public class Driver {
//	// interestingly, drools-spring uses 5.X complier which doesn't play nice with the 6.x compiler in the simple example
//
//	public static void main(String[] _) {
//		PositionFactory pf = new PositionFactory();
//		Position chase = pf.getChase1000();
//		Position wamu = pf.getWaMu500();		
//
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/io/github/dwin357/springDrools/application-context.xml");
//		Client client = applicationContext.getBean("PositionServiceImpl", Client.class);
//		
//		client.evaluatePosition(chase);
//		client.evaluatePosition(wamu);
//	}
//}
