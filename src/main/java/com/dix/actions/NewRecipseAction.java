package com.dix.actions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dix.entity.Exercise;
import com.dix.entity.Meal;

public class NewRecipseAction
{
	private String nameRecipe;
	private String shourtDescribe;
	private String componentsRecipe;
	private String methodOfPreparing;
	private int calories;
	
	public String getNameRecipe() {
		return nameRecipe;
	}
	
	public void setNameRecipe(String nameRecipe) {
		this.nameRecipe = nameRecipe;
	}
	
	public String getShourtDescribe() {
		return shourtDescribe;
	}
	
	public void setShourtDescribe(String shourtDescribe) {
		this.shourtDescribe = shourtDescribe;
	}
	
	public String getComponentsRecipe() {
		return componentsRecipe;
	}
	
	public void setComponentsRecipe(String componentsRecipe) {
		this.componentsRecipe = componentsRecipe;
	}
	
	public String getMethodOfPreparing() {
		return methodOfPreparing;
	}
	
	public void setMethodOfPreparing(String methodOfPreparing) {
		this.methodOfPreparing = methodOfPreparing;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String execute() throws Exception
	{
		SessionFactory sessionFactory;
		Session session;
		
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		session.beginTransaction();
		Meal meal = new Meal();
		meal.setCalories(calories);
		meal.setComponentsRecipe(componentsRecipe);
		meal.setMealId(1);
		meal.setMethodOfPreparing(methodOfPreparing);
		meal.setNameRecipe(nameRecipe);
		meal.setShourtDescribe(shourtDescribe);
		session.save(meal);
		session.getTransaction().commit();
		session.close();
		
		return "newRecipeDone";
	}


}
