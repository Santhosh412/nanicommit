package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Album;
import com.ojas.servies.AlbumService;



@RestController
@RequestMapping("/rest/api")
public class AlbumController {
	@Autowired
	private AlbumService albumSer;

	@PostMapping("/add")
	public Album addAlbum(@RequestBody Album album) {
		Album addAlbum = albumSer.addAlbum(album);
		return addAlbum;
	}

	@GetMapping("/list")
	public List<Album> listOfAlbum() {
		List<Album> list = albumSer.listOfAlbum();
		return list;
	}

	@GetMapping("/getId/{id}")
	public Album getAlbumById(@PathVariable int id) {
		Album albumById = albumSer.getAlbumById(id);
		return albumById;
	
	}
	@GetMapping("/delete/{id}")
	public void getDeleteId(@PathVariable int id) {
		albumSer.deleteById(id);
		
	}
	@PutMapping("/update")
	public Album updateById( @RequestBody Album album ) {
		
		return albumSer.updateById(album);
		
	}
	@GetMapping("/getYear/{year}")
	public List<Album> getYearById(@PathVariable int year) {
		 return albumSer.getYear(year);
	}
	@GetMapping("/getAlbumName/{albumname}")
	public List<Album> findByAlbumName(@PathVariable String albumname){
		return albumSer.getAlbumName(albumname);
		
	}
}
