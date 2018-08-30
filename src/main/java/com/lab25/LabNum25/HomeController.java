package com.lab25.LabNum25;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	MovieRepository movieRepo;
	
//	
//	@GetMapping("/")
//	public List<Movie> listAll(){
//		ArrayList<Movie> movieList = list();
//		
//		return movieList;
//	}
	

	
	@GetMapping("/movielist")
	public List<Movie> movieList(){
		List<Movie> movieList =  movieRepo.findAll();
		//List<Movie> movieList =  new ArrayList<>();
		
		return movieList;
	}
	
	@GetMapping("/categorysearch")
	public List<Movie> categorySearch (@RequestParam("category")String category){
		List <Movie> categorySearch =  movieRepo.findByCategory(category);
		return  categorySearch;
	}
	
	@GetMapping("/radommovie")
	public Movie random() {
		int rand = (int) Math.random() * (movieRepo.findAll().size() + 1);
			//this means random num is btwn 1 - length of size
			//if Math.random() * 100) then this means num is between 0-100
		Movie result =  movieRepo.getOne(rand); 
		return result;
	}
	
	@GetMapping("/randomcategory")
	public Movie randomCategory(@RequestParam("category")String category){
		List<Movie> result = movieRepo.findByCategory(category);
		int randCategory= (int)(Math.random() * result.size());
		Movie finalResult = result.get(randCategory);
		return finalResult;
		
		
	}
	
	
	
	@GetMapping("/findtitlekey/{title}")
	public List<Movie> findTitleKey(@RequestParam("title")String title){
		List<Movie> result = movieRepo.findByTitleContaining(title);
		return result;
	}
	
	@GetMapping("/findtitle/{title}")
	public List<Movie> findTitle(@RequestParam("title")String title){
		List<Movie> result = movieRepo.findByTitle(title);
		return result;
	}
	
//	private ArrayList<Movie> list() {
//		ArrayList<Movie> movieList = new ArrayList<>();
//		movieList.add(new Movie(1, "Java for Beginners", "Ben"));
//		movieList.add(new Movie(2, "Java for Advance Devs", "Grant Chirpus"));
//		movieList.add(new Movie(3, "JS for Beginners", "John"));
//		return movieList;
//	}
}
