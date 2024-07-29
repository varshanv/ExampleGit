package com.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.EmpModel;
import com.web.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("getEmp/{job}")
	public List<EmpModel> viewEmp(@PathVariable String job) {
		return service.getEmp(job);
	}

	@GetMapping("viewEmps")
	public List<EmpModel> viewEmpAll(){
		return service.viewAll();
	}
	
	@PostMapping("addEmp")
	public void addEmp1(@RequestBody EmpModel model) {
		service.addEmp(model);
	}
	@GetMapping("getEmpSalGT/{sal}")
	public List<EmpModel> viewEmpSalGT(@PathVariable int sal){
		return service.getSalGT(sal);
	}
}
