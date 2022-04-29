// package com.springboot.ot_application.JoinQueryServices;

// import java.util.List;
// import java.util.Optional;
// import javax.annotation.Resource;
// import org.springframework.stereotype.Service;

// import com.springboot.ot_application.EntityModel.Designations;
// import com.springboot.ot_application.EntityModel.ProjectList;
// import com.springboot.ot_application.EntityModel.User_Details;
// import com.springboot.ot_application.Repository.Designations_Repository;
// import com.springboot.ot_application.Repository.Insert_Repository;
// import com.springboot.ot_application.Repository.Project_List_Repopsitory;
// import com.springboot.ot_application.Repository.User_Details_Repository;

// @Service
// public class JoinQueryService {

// 	@Resource
// 	private User_Details_Repository user_Details_Repository;
	
// 	@Resource
// 	private Designations_Repository designations_Repository;
	
// 	@Resource
// 	private Insert_Repository insert_Repository;
	
// 	@Resource
// 	private Project_List_Repopsitory project_List_Repopsitory;
	
	
	
// 	// public List<Designations> getDesignation() {
// 	// 	List<Designations> list = designations_Repository.findAll();
// 	// 	list.forEach(l -> System.out.println(l));
// 	// 	return list;
// 	// }

// 	public List<User_Details> getUsers() {
// 		List<User_Details> list = user_Details_Repository.findAllByOrderByIdDesc();
// 		list.forEach(l -> System.out.println(l));
// 		return list;
// 	}
	

// 	public Optional<User_Details> findById(int theId) {
// 		return user_Details_Repository.findById(theId);
// 	}
	
// 	public void save(User_Details userDetail) {
// 		user_Details_Repository.save(userDetail);
// 	}

// 	public void deleteById(int userId) {
// 		user_Details_Repository.deleteById(userId);
		
// 	}
	
// 	//project list table repository	
// 		public List<ProjectList> getProjectList() {
// 			List<ProjectList> list = project_List_Repopsitory.findAll();
// 			list.forEach(l -> System.out.println(l));
// 			return list;
// 		}
		
		
// 		public Optional<ProjectList> findByProjectId(int theId) {
// 			return project_List_Repopsitory.findById(theId);
// 		}
		
// 		public void save(ProjectList projectList) {
// 			project_List_Repopsitory.save(projectList);
// 		}

// 		public void deleteByProjectId(int ProjectId) {
// 			project_List_Repopsitory.deleteById(ProjectId);
			
// 		}

		
// 		public List<ProjectList> getProject() {
// 			List<ProjectList> list = project_List_Repopsitory.getAllProjects();
// 			list.forEach(l -> System.out.println(l));
// 			return list;
// 		}	
		
// }
