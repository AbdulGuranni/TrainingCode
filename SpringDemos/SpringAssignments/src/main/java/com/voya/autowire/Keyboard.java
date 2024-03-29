package com.voya.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("keyboard")
public class Keyboard implements IInstrument{

	@Override
	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println("The keyboard song is"+song);
	}
	
}
