package com.dix.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "posilk")

public class Meal 
{
	@Id
	@GeneratedValue
	private int mealId;
	private String nameRecipe;
	private String shourtDescribe;
	private String componentsRecipe;
	private String methodOfPreparing;
	private int calories;
	
	public int getMealId() {
		return mealId;
	}
	public void setMealId(int mealId) {
		this.mealId = 1;
	}
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


}
