package com.voya.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Engine {
	private int capacity;
	private String type;
	private Engine engine;
	public int getCapacity() {
		return capacity;
	}
	@Value("100")
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Value("Diesel")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public Engine getEngine(Engine engine) {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + ", engine=" + engine + "]";
	}
	

}
