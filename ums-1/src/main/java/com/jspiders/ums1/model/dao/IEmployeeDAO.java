package com.jspiders.ums1.model.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jspiders.ums1.dto.EmployeeDTO;
public interface IEmployeeDAO extends JpaRepository<EmployeeDTO,Integer>
{

}
