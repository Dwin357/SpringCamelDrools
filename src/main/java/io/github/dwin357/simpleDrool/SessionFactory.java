//package io.github.dwin357.simpleDrool;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//
//import org.drools.compiler.compiler.DroolsParserException;
//import org.drools.compiler.compiler.PackageBuilder;
//import org.drools.core.RuleBase;
//import org.drools.core.RuleBaseFactory;
//import org.drools.core.WorkingMemory;
//
//public class SessionFactory {
//	private static String RULE_FILE = "/io/github/dwin357/rules/SimpleRules.drl";
//
//	
//	
//	public WorkingMemory getSession() {
//		try {
//			return getRuleBase().newStatefulSession();
//		} catch(Exception e) {
//			throw new IllegalStateException("Session Factory fell down", e);
//		}
//	}
//	
//	private RuleBase getRuleBase() throws DroolsParserException, IOException {
//		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
//		ruleBase.addPackage(getRulesPackage());
//		return ruleBase;
//	}
//
//	private org.drools.core.rule.Package getRulesPackage() throws DroolsParserException, IOException {
//		PackageBuilder packageBuilder = new PackageBuilder();
//		packageBuilder.addPackageFromDrl(getReaderOfRules());	
//		return packageBuilder.getPackage();
//	}
//
//	private Reader getReaderOfRules() {
//		InputStream resourceAsStream = getClass().getResourceAsStream(RULE_FILE);
//		return new InputStreamReader(resourceAsStream);
//	}
//}
//
//
