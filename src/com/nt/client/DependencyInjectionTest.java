package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// create the IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nt/cfgs/applicationContext.xml");

		// get target Spring bean class obj from the IOC container
		Object obj = ctx.getBean("wmg");

		WishMessageGenerator generator = (WishMessageGenerator) obj;

		// invoke the business method
		String result = generator.generateWishMessage("Raja");
		System.out.println("Result::" + result);

		// close the IOC container
		ctx.close();

	}// main

}// class
