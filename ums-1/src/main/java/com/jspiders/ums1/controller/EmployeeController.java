package com.jspiders.ums1.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.ums1.dto.EmployeeDTO;
import com.jspiders.ums1.model.service.EmployeeService;
@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	public EmployeeController()
	{
		System.out.println("EmployeeController constructor");
	}
	@PostMapping(value="/save")
	public void saveOrUpdate(@RequestBody EmployeeDTO dto)
	{
		service.saveOrUpdate(dto);
	}
	@PostMapping(value="/saveFromView")
	public ModelAndView saveOrUpdateView(EmployeeDTO dto)
	{
		service.saveOrUpdateView(dto);
		return new ModelAndView("index");
	}
	@PostMapping(value="/saveAll")
	public void saveOrUpdateAll(@RequestBody List<EmployeeDTO> dto)
	{
		service.saveOrUpdateAll(dto);
	}
	@GetMapping(value="/get")
	public @ResponseBody List<EmployeeDTO> getAllEmp()
	{
		return service.getAllEmp();
	}
	@GetMapping(value="/getEmp/{id}")
	public @ResponseBody Optional<EmployeeDTO> getEmp(@PathVariable("id")int id)
	{
		Optional<EmployeeDTO> dto=service.getEmpById(id);
		return dto;
	}
}
/*http://localhost:8060/get
 http://localhost:8060/save
 http://localhost:8060/saveAll
 http://localhost:8060/getEmp/1
	 --postman client */
 