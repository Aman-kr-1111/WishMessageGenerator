package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	// HAS-a property
	@Autowired
//	@Qualifier("ldt2")
	private LocalDateTime dateTime;

//	@Autowired
//	public void assignDateTime(LocalDateTime dateTime) {
//		System.out.println("WishMessageGenerator.assignDateTime()");
//		this.dateTime = dateTime;
//	}
//
//	@Autowired
//	public void putDate(Date dt) {
//		System.out.println("WishMessageGenerator.putDate()");
//		this.date = dt;
//	}

// Constructor set Injection
//	@Autowired
//	public WishMessageGenerator(LocalDateTime dateTime) {
//		System.out.println("WishMessageGenerator: 1-param constructor");
//		this.dateTime = dateTime;
//	}
//
//	// Constructor set Injection
//	@Autowired
//	public WishMessageGenerator(LocalDateTime dateTime, Date dt) {
//		System.out.println("WishMessageGenerator: 2-param constructor");
//		this.dateTime = dateTime;
//		this.date = dt;
//	}

	// Setter method for set Injection
//	@Autowired
//	public void setDateTime(LocalDateTime dateTime) {
//		System.out.println("WishMessageGenerator.setDateTime()");
//		this.dateTime = dateTime;
//	}

//	@Autowired
//	public void setDate(Date date) {
//		System.out.println("WishMessageGenerator.setDate()");
//		this.date = date;
//	}

	// b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage() -->" + dateTime);

		// get current hour of the day
		int hour = dateTime.getHour();

		// generate the wish message
		if (hour < 12) {
			return "Good Morning, " + user;
		} else if (hour < 16) {
			return "Good Afternoon, " + user;
		} else if (hour < 20) {
			return "Good Evening, " + user;
		} else {
			return "Good Night, " + user;
		}
	}

}// class
