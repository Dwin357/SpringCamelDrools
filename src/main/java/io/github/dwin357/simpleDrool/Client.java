//package io.github.dwin357.simpleDrool;
//
//import org.drools.core.WorkingMemory;
//
//import io.github.dwin357.models.Position;
//
//public class Client {
//	private WorkingMemory session;
//	
//	public Client() {
//		super();
//		SessionFactory sf = new SessionFactory();
//		this.session = sf.getSession();
//	}
//	
//	public void evaluatePosition(Position position) {
//		System.out.println("Position before rules lender:" + position.getLender() + " %:" + position.getAvaliablePercentage());
//		this.session.insert(position);
//		this.session.fireAllRules();
//		System.out.println("Position after rules lender:" + position.getLender() + " %:" + position.getAvaliablePercentage());
//	}
//	
//}
