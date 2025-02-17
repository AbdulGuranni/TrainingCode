package com.voya.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performance {
	@Autowired
	@Qualifier("violin")
	IInstrument instrument;
	
	@Autowired
	@Qualifier("keyboard")
	IInstrument keyboard;
	@Autowired
	@Qualifier("guitar")
	IInstrument guitar;
	
	void playMusic(String choice,String song) {
		if(choice.equals("v"))
			instrument.play(song);
		if(choice.equals("k"))
			keyboard.play(song);
		if(choice.equals("g"))
			guitar.play(song);
	}

}
