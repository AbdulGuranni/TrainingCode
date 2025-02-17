package com.doctorapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.IDoctorRepository;



@Service
public class DoctorServiceImpl implements IDoctorService{
	@Autowired
	private IDoctorRepository doctorRepository;
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.addDoctor(doctor);
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		doctorRepository.updateDoctor(doctorId, fees);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorRepository.deleteDoctor(doctorId);
	}

	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		Doctor doctor= doctorRepository.findById(doctorId);
		if(doctor==null)
			throw new IdNotFoundException("Id not found");
		else
			return doctor;
	}

	@Override
	public List<Doctor> getSpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctor = doctorRepository.findSpeciality(speciality);
		if(doctor.isEmpty())
			throw new DoctorNotFoundException("Doctor not found");
		else
			return doctor;
	}

	@Override
	public List<Doctor> getAll() throws DoctorNotFoundException {
		List<Doctor> doctor = doctorRepository.findAll();
		if(doctor.isEmpty())
			throw new DoctorNotFoundException("Doctor not found");
		
		return doctor;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctor = doctorRepository.findBySpecialityAndExp(speciality, experience);
		if(doctor.isEmpty())
			throw new DoctorNotFoundException("Doctor not found");
		else
			return doctor;
	}

	@Override
	public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctor = doctorRepository.findBySpecialityAndLessFees(speciality, fees);
		if(doctor.isEmpty())
			throw new DoctorNotFoundException("Doctor not found");
		else
			return doctor;
	}

	@Override
	public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
		List<Doctor> doctor = doctorRepository.findBySpecialityAndRatings(speciality, ratings);
		if(doctor.isEmpty())
			throw new DoctorNotFoundException("Doctor not found");
		else
			return doctor;
	}

	@Override
	public List<Doctor> getSpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		List<Doctor> doctor = doctorRepository.findSpecialityAndNameContains(speciality, doctorName);
		if(doctor.isEmpty())
			throw new DoctorNotFoundException("Doctor not found");
		else
			return doctor;
	}
	

}
