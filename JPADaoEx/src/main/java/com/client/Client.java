package com.client;

import com.dao.ClothDao;
import com.model.Cloth;

public class Client {

	public void saveMethod() {
		Cloth cloth = new Cloth();
		cloth.setClothId(4);
		cloth.setClothType("Track Suite");
		cloth.setClothCost(600f);
		ClothDao clothDao = new ClothDao();
		System.out.println("Try to save object into database..");
		int saveObj = clothDao.saveObj(cloth);
		if (saveObj == 1) {
			System.out.println("Object Saved successfully..");
		} else {
			System.out.println("Object can't save..");
		}
	}

	public void deleteMethod() {
		int deletedId = 4;
		ClothDao clothDao = new ClothDao();
		System.out.println("Try to delete object from database..");
		if (clothDao.deleteObj(deletedId)) {
			System.out.println("Object delete successfully...id is : " + deletedId);
		} else {
			System.out.println("Sorry Object not found.");
		}

	}

	public void updateMethod() {
		Cloth cloth = new Cloth();
		cloth.setClothId(4);
		cloth.setClothType("Track Suite");
		cloth.setClothCost(600f);
		ClothDao clothDao = new ClothDao();
		System.out.println("Try to update object into database..");
		int saveObj = clothDao.updateObj(cloth);
		if (saveObj == 1) {
			System.out.println("Object updated successfully..");
			System.out.println(cloth);
		} else {
			System.out.println("Object can't save..");
		}
	}

	public static void main(String[] args) {
		Client client = new Client();
		// client.saveMethod();
		// client.deleteMethod();

		Cloth cloth = new Cloth();
		cloth.setClothId(4);
		cloth.setClothType("Cot");
		cloth.setClothCost(2500f);
		new ClothDao().updateObj(cloth);

	}

}
