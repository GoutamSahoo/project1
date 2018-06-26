package com.jspiders.ums1.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.ums1.dto.EmployeeDTO;
import com.jspiders.ums1.model.dao.IEmployeeDAO;

@Service
public class EmployeeService 
{
	@Autowired
	private IEmployeeDAO dao;
	public void saveOrUpdate(EmployeeDTO dto)
	{
		dao.save(dto);
	}
	public void saveOrUpdateAll(List<EmployeeDTO> dto)
	{
		dao.saveAll(dto);
	}
	public void saveOrUpdateView(EmployeeDTO dto)
	{
		dao.save(dto);
	}
	public Optional<EmployeeDTO> getEmpById(int id)
	{
		Optional<EmployeeDTO> dto=dao.findById(id);
		return dto;
	}
	public List<EmployeeDTO> getAllEmp()
	{
		return dao.findAll();
	}
}
