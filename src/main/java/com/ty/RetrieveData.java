package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetrieveData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("praveen");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person person= entityManager.find(Person.class, 1);
		System.out.println(person.getGender());
		AadharCard ad= entityManager.find(AadharCard.class, 1);
		System.out.println(ad.getAadharno());
	}
	
}
