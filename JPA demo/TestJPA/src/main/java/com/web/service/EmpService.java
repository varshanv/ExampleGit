package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.EmpModel;
import com.web.repo.EmpRepoJPA;


@Service
public class EmpService {
	
	@Autowired
	private EmpRepoJPA repo;

	public List<EmpModel> getEmp(String job) {
		return repo.findByJob(job);
	}

	public void addEmp(EmpModel emp) {
		repo.save(emp);
	}
	public List<EmpModel> viewAll(){
		return repo.findAll();
	}
	public List<EmpModel> getSalGT(int sal){
		return repo.findBySalGreaterThan(sal);
	}
	
}
