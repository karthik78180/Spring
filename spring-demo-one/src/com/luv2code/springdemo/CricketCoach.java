package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("inside no arg methods");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("This is from setfortuneservice Setter method");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "This is cricketcoach getDaily workout";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
