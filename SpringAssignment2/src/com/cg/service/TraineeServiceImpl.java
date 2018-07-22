package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.DAO.TraineeDao;
import com.cg.beans.Trainee;

@Component
public class TraineeServiceImpl implements TraineeService{
	@Autowired
	TraineeDao dao;

	@Override
	public Trainee addDetails(Trainee trainee) {
	
		return dao.save(trainee);
	}

	@Override
	public Trainee getDetails(int traineeId) {
		
		return dao.findOne(traineeId);
	}

	@Override
	public List<Trainee> getAllDetails() {
		List<Trainee> list=dao.findAll();
		return list;
	}

	@Override//doubt
	public void delete(int traineeId) {
		Trainee trainee=dao.findOne(traineeId);
		dao.delete(trainee);
		
	}

	@Override
	public Trainee modify(int traineeId) {
		
		return null;
	}

}
