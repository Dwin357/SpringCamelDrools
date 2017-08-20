//package io.github.dwin357.springCamel;
//
//import org.apache.camel.builder.RouteBuilder;
//
//public class SimpleRouteBuilder extends RouteBuilder {
//
//	@Override
//	public void configure() throws Exception {
//		from("file:/home/dwin/workspace/SpringCamelDrool/ballHopper")		
//		  .process(new SimpleProcessor()) // even though it doesn't look like it, this is actually reusing a bean
//		  .to("file:/home/dwin/workspace/SpringCamelDrool/bullsEye");
//
//	}
//
//}
