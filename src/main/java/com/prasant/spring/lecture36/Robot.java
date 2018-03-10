package com.prasant.spring.lecture36;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private String id = "Default robot";
	
	private String speech = "Hello";
	
	public void speak() {
		System.out.println(id + " : " + speech);
	}

	@Autowired
	public void setId(@Value("#{randomText.text?.length()}") String id) {
		this.id = id;
	}

	@Autowired
	// new java.util.Date().toString()
	// T(Math).PI
	// T(Math).sin(90)
	// T(Math).sin(T(Math).PI/4)
	// T(Math).sin(T(Math).PI/4) ^ 2
	// T(Math).sin(T(Math).PI/4) ^ 2 le 0.5
	// T(Math).sin(T(Math).PI/4) ^ 2 le 0.5 ? 'yes' : 'no'
	public void setSpeech(@Value("#{ T(Math).sin(T(Math).PI/4) ^ 2 le 0.5 ? 'yes' : 'no' }") String speech) {
		this.speech = speech;
		
	}

}
