package com.springboot.ot_application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.springboot.ot_application.EntityModel.ProjectAssign;

public interface Project_Assign_Repository extends JpaRepository<ProjectAssign, String> {

	
//	List<ProjectAssign> findAllByOrderByNameDesc();
	
	
	@Transactional
	@Modifying
	@Query(value = "Select u.employee_table_id as  employee,u.employee_name, sum(case p.is_active when 'true' then 1 else 0 end) projectcount from \r\n"
			+ "user_details u left join public.project_assign p on p.employee_table_id=u.employee_table_id\r\n"
			+ "group by u.employee_table_id order by u.employee_table_id \r\n"
			+ "",
			  nativeQuery = true)
	List<Object[]> projectsCount();
	
	
	//soft delete change values
		@Transactional
		@Modifying
		@Query(value = "UPDATE project_assign SET is_active = false WHERE employee_table_id=:employeeTableId and "
				+ "project_table_id=:projectTableId ",
				  nativeQuery = true)
		public int deleteProjectAssign(int employeeTableId, int projectTableId);
		
		
		@Transactional
		@Modifying
		@Query(value = "SELECT employee_table_id FROM project_assign  WHERE is_active= true and"
				+ " project_table_id = :projectTableId ",
				  nativeQuery = true)
		public List<Object[]> checkProjectAssign(int projectTableId);
		
		
		@Transactional
		@Modifying
		@Query(value = "SELECT COUNT(*) FROM project_assign WHERE  employee_table_id=:employeeTableId and "
				+ "project_table_id=:projectTableId and is_active= true",
				nativeQuery = true)
		List<Object[]> duplicateCheck(int employeeTableId, int projectTableId);
		
		
		@Transactional
		@Modifying
		@Query(value = "SELECT project.project_name FROM project_assign  INNER JOIN project  ON project.id = project_assign.project_table_id"
				+ "  WHERE project_assign.is_active=true and project_assign.employee_table_id =:employeeTableId",
				  nativeQuery = true)
		public List<Object[]> employeeProjects(int employeeTableId);
		

		
	
	
}
