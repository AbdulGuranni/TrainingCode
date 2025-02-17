package com.doctorapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDb;
import com.doctorapp.util.Queries;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	private JdbcTemplate jdbcTemplate;
	
	
	public DoctorRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Object[] doctorArr = {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getExperience(),doctor.getRatings(),doctor.getFees()};
		jdbcTemplate.update(Queries.INSERTQUERY,doctorArr);
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.UPDATEQUERY,fees,doctorId);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.DELETEQUERY, doctorId);
		
	}

	@Override
	public Doctor findById(int doctorId) throws IdNotFoundException {
		Doctor doctor =jdbcTemplate.queryForObject(Queries.FINDBYID, new DoctorMapper(),doctorId);
		return doctor;
	}

	@Override
	public List<Doctor> findSpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECIALITY,new DoctorMapper(),speciality);
		return doctor;
	}

	@Override
	public List<Doctor> findAll() throws DoctorNotFoundException {
		RowMapper<Doctor> mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDALLQUERY, mapper);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECANDEX,new DoctorMapper(),speciality,experience);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECANDFEES,new DoctorMapper(),speciality,fees);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECANDRATINGS,new DoctorMapper(),speciality,ratings);
		return doctor;
	}

	@Override
	public List<Doctor> findSpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECANDNAME,new DoctorMapper(),speciality,doctorName);
		return doctor;
	}

	

}
