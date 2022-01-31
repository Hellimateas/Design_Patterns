package com.newPattern;

import com.newPattern.patterns.singleton.SingletonLazyHolder;

public class Main {

	public static void main(String[] args) {

		//Testando o Singleton
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		

	}

}
