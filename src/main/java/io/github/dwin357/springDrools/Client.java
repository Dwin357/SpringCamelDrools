//package io.github.dwin357.springDrools;
//
//import org.drools.runtime.StatelessKnowledgeSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.stereotype.Component;
//
//import io.github.dwin357.models.Position;
//
//@Component("PositionServiceImpl")
//public class Client {
//	
//	@Autowired
//	private ApplicationContext applicationContext;
//	
//	public void evaluatePosition(Position position) {
//		System.out.println("Position before rules lender:" + position.getLender() + " %:" + position.getAvaliablePercentage());
//		StatelessKnowledgeSession session = applicationContext.getBean("anything", StatelessKnowledgeSession.class);		
//		session.execute(position);
//		System.out.println("Position after rules lender:" + position.getLender() + " %:" + position.getAvaliablePercentage());
//	}
//
//
//}
