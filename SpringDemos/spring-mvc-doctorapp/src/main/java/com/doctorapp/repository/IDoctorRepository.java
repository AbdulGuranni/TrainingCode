package com.doctorapp.repository;

import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorRepository {
	 void addDoctor(Doctor doctor);
	    void updateDoctor(int doctorId,double fees);
	    void deleteDoctor(int doctorId);
	    Doctor findById(int doctorId) throws IdNotFoundException;

	    List<Doctor> findSpeciality(String speciality) throws DoctorNotFoundException;
	    List<Doctor> findAll() throws DoctorNotFoundException;
	    List<Doctor> findBySpecialityAndExp(String speciality,int experience) throws DoctorNotFoundException;
	    List<Doctor> findBySpecialityAndLessFees(String speciality,double fees) throws DoctorNotFoundException;
	    List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException;
	    List<Doctor> findSpecialityAndNameContains(String speciality,String doctorName) throws DoctorNotFoundException;

}
