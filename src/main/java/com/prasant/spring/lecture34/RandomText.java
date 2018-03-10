package com.prasant.spring.lecture34;

import java.util.Random;

public class RandomText {
	
	private static String[] texts = {
			"Hello Shaktimaan",
			"I'll fly",
			"Roll panda roll",
			null
	};
	
	public String getText() {
		Random random = new Random();
		//System.out.println(random.nextInt(texts.length));
		return texts[random.nextInt(texts.length)];
	}

}
