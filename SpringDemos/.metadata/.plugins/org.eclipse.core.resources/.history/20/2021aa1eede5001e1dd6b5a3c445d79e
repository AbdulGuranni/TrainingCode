package com.doctorapp.service;

import java.util.Collections;
import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.DoctorRepositoryImpl;
import com.doctorapp.repository.IDoctorRepository;

public class DoctorServiceImpl implements IDoctorService{
	IDoctorRepository doctorRepository= new DoctorRepositoryImpl();
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.addDoctor(doctor);
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		doctorRepository.updateDoctor(doctorId,fees);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorRepository.deleteDoctor(doctorId);
	}

	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		 Doctor doctor= doctorRepository.findById(doctorId);
//       if(doctor==null)
//           throw new IdNotFoundException("Invalid Id");
       return doctor;
	}

	@Override
	public List<Doctor> getSpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctorList = doctorRepository.findSpeciality(speciality);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("Doctor with this speciality is not available");
        Collections.sort(doctorList,(d1,d2)->(d1.getDoctorName().compareTo(d2.getDoctorName())));
        return doctorList;
	}

	@Override
	public List<Doctor> getAll() throws DoctorNotFoundException {
		List<Doctor> doctorList=doctorRepository.findAll();
        return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctorList = doctorRepository.findBySpecialityAndExp(speciality,experience);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("Doctor with this speciality is not available");
        Collections.sort(doctorList,(d1,d2)->((Integer)d2.getExperience()).compareTo(d1.getExperience()));
        return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
		 List<Doctor> doctorList = doctorRepository.findBySpecialityAndLessFees(speciality,fees);
	        if(doctorList.isEmpty())
	            throw new DoctorNotFoundException("Doctor with this speciality is not available");
	        Collections.sort(doctorList,(d1,d2)->((Double)d1.getFees()).compareTo(d2.getFees()));
	        return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
		 List<Doctor> doctorList = doctorRepository.findBySpecialityAndRatings(speciality,ratings);
	        if(doctorList.isEmpty())
	            throw new DoctorNotFoundException("Doctor with this speciality is not available");
	        Collections.sort(doctorList,(d1,d2)->((Integer)d1.getRatings()).compareTo(d2.getRatings()));
	        return doctorList;
	}

	@Override
	public List<Doctor> getSpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		List<Doctor> doctorList = doctorRepository.findSpecialityAndNameContains(speciality,doctorName);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("Doctor with this speciality is not available");
        Collections.sort(doctorList,(d1,d2)->((Integer)d1.getDoctorName().compareTo(d2.getDoctorName())));
        return doctorList;
	}
	

}
