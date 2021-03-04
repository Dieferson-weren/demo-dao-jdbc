package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TESTE 1:  Deparment finById");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n ===== TESTE 2:  Deparment findall");
		List<Department> list = departmentDao.findAll();
		
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		/*System.out.println("\n ===== TESTE 3:  Deparment insert");
		Department newDepartment= new Department(null, "Several");
		departmentDao.insert(newDepartment);
		System.out.println("Departamento " + newDepartment.getId() + " Adicionado");*/
		
		System.out.println("\n ===== TESTE 4:  Deparment update");
		department = departmentDao.findById(5);
		department.setName("Several");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n ===== TESTE 5:  Deparment delete");
		departmentDao.deleteById(5);
		System.out.println("Delete completed");
	}

}
