package com.prasant.spring.lecture35;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {
	
	private static String[] texts = {
			"Hello Shaktimaan",
			"I'll fly",
			"Roll panda roll",
			null
	};
	
	public String getText() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}

}
