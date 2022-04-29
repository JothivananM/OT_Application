package com.springboot.ot_application.Repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.springboot.ot_application.EntityModel.ProjectList;

public interface Project_List_Repopsitory extends JpaRepository<ProjectList, Integer> {

	
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM project order by id desc",
			  nativeQuery = true)
	List<ProjectList> getAllProjects();
	
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE project SET is_active=:isActive WHERE id=:Id",
			  nativeQuery = true)
	public int deleteProject(Boolean isActive,int Id);
	
	// @Query(value = "SELECT * FROM project p order by id desc where is_active=true",
	// nativeQuery = true)
	
}
