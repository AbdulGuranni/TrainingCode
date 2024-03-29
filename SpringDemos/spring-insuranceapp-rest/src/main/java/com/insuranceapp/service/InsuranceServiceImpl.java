package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;

@Service
public class InsuranceServiceImpl implements IInsuranceService{

	@Override
	public List<Insurance> getAll() {
		// TODO Auto-generated method stub
		return getAllInsurance();
	}

	@Override
	public Insurance getById(int insuranceId) {
		List<Insurance> insurances = getAllInsurance();
		for(Insurance insurance:insurances) {
			return insurance;
		}
		return null;
	}
	private List<Insurance> getAllInsurance(){
		return Arrays.asList(
				new Insurance(101, "VO-HOO1","Voya","Health",10,10000),
				new Insurance(102, "BJ-MO1","Bajaj","motor",10,5000),
				new Insurance(103, "FI-Life","Fedility","life",15,8000),
				new Insurance(104, "VO-MAX1","Voya","Health",10,3000),
				new Insurance(105, "FI-motor","Fedility","motor",12,4000)
				);
	}

}
