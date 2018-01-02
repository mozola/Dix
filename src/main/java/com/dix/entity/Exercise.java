package com.dix.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cwiczenia")
public class Exercise 
{
	private String name;
	private String description;
	private String specyfication;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSpecyfication() {
		return specyfication;
	}
	public void setSpecyfication(String specyfication) {
		this.specyfication = specyfication;
	}
}
