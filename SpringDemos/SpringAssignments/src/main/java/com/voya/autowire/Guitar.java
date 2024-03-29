package com.voya.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("guitar")
public class Guitar implements IInstrument{

	@Override
	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println("The guitar song is"+song);
	}
	

}
