package com.example.calculatecreditscore.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateCreditScore {
	
	@GetMapping("/calculateCreditScore/{ssnNumber}")
	public int getCreditScore(@PathVariable String ssnNumber) {
		Random random = new Random();
		int creditScore = random.nextInt(800);
		return creditScore;
				
	}

}
