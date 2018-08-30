package com.lab25.LabNum25;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) //auto increment
	
	private Integer id;
	private String title;
	private String category;
	
	public Movie() {
	}

	public Movie(int id, String title, String category) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "id=" + id + ", title=" + title + ", category=" + category ;
	}
	
	
	
	
	
	
}
