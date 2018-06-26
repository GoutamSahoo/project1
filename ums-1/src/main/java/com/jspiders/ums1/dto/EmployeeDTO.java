package com.jspiders.ums1.dto;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table
public class EmployeeDTO implements Serializable
{
	@Id
	@GenericGenerator(name="any",strategy="increment")
	@GeneratedValue(generator="any")
	private int id;
	private String empName;
	private String empId;
	private Long empAge;
	private Long empNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Long getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Long empAge) {
		this.empAge = empAge;
	}
	public Long getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(Long empNumber) {
		this.empNumber = empNumber;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", empName=" + empName + ", empId=" + empId + ", empAge=" + empAge
				+ ", empNumber=" + empNumber + "]";
	}
}
