package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("italian")
public class Italian implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		return Arrays.asList("Italian sushi","Italia desert");
	}

}
