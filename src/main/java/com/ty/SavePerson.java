package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("praveen");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Praveen");
		person.setGender("Male");
		person.setPhno(7894561230l);
		
		AadharCard aadharCard=new AadharCard();
		aadharCard.setAadharno(789456123012l);
		aadharCard.setAddress("BTM");
		
		Person person1=new Person();
		person1.setName("Praveen");
		person1.setGender("Male");
		person1.setPhno(7894561230l);
		
		AadharCard aadharCard1=new AadharCard();
		aadharCard1.setAadharno(789456123012l);
		aadharCard1.setAddress("BTM");
		
		person.setCard(aadharCard);
		person1.setCard(aadharCard1);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(aadharCard);
		entityManager.persist(aadharCard1);
		entityTransaction.commit();
	}

}
