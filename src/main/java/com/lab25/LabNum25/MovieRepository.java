package com.lab25.LabNum25;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	List<Movie> findByTitle(String title);
	List<Movie> findByCategory(String category);
	List<Movie> findByTitleContaining(String title);
	
	
	
	
	
	
	
	
	
	
	
}
