package com.ojas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.Album;

@Repository
public interface Albumdao extends JpaRepository<Album, Integer> {

	public List<Album> findByYear(int year);
	public List<Album> findByAlbumname(String albumname);

}
