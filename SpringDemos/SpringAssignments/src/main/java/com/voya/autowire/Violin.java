package com.voya.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Violin")
public class Violin implements IInstrument{

	@Override
	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println("The song of the violin is"+song);
	}
	

}
