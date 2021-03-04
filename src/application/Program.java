package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== teste 1: Seller FindById ===");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n === teste 2: Seller FindByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === teste 3: Seller FindAll ===");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === teste 4: Seller Insert ===");
		
		Seller newSeller = new Seller(null, "Dieferson Weren", "dieferson.weren", new Date(), 900.00, department);
		sellerDao.insert(newSeller);
		
		System.out.println("Iinserido um novo ID: " + newSeller.getId());
		
		System.out.println("\n === teste 5: Seller Update ===");
		
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed");
	}

}
