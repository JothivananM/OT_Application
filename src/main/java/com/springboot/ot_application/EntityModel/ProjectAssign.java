package com.springboot.ot_application.EntityModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_assign")
//@Where(clause = "is_active = true")
public class ProjectAssign {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;
	
	@Column(name = "employee_table_id")
	private int employeeTableId;
	
	@Column(name = "project_table_id")
	private int projectTableId;
	
	
	public ProjectAssign()
	{
		
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getEmployeeTableId() {
		return employeeTableId;
	}


	public void setEmployeeTableId(int employeeTableId) {
		this.employeeTableId = employeeTableId;
	}


	public int getProjectTableId() {
		return projectTableId;
	}


	public void setProjectTableId(int projectTableId) {
		this.projectTableId = projectTableId;
	}


	@Override
	public String toString() {
		return "Project_Assign_Without_Join [Id=" + Id + ", employeeTableId=" + employeeTableId + ", projectTableId="
				+ projectTableId + "]";
	}


}
