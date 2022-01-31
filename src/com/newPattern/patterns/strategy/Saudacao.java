package com.newPattern.patterns.strategy;

public class Saudacao implements AcoesDaBoneca {

	@Override
	public void falasBoneca(){
		System.out.println("Olá! Você está bem?");
	}
}
