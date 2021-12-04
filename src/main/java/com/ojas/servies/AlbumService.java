package com.ojas.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.Albumdao;
import com.ojas.model.Album;

@Service
public class AlbumService {
	@Autowired
	private Albumdao albumDao;

	public Album addAlbum(Album album) {
		Album save = albumDao.save(album);
		return save;
	}

	public List<Album> listOfAlbum() {
		List<Album> list = albumDao.findAll();
		return list;

	}

	public Album getAlbumById(int id) {
		Album album = albumDao.findById(id).get();
		return album;
	}

	public void deleteById(int id) {
		albumDao.deleteById(id);

	}

	public Album updateById(Album album) {
		Album a = albumDao.save(album);
//		album.setAlbumname(a.getAlbumname());
//		album.setTracks(a.getTracks());
//		album.setYear(a.getYear());
		return a;
	}

	public List<Album> getYear(int year) {
		return albumDao.findByYear(year);

	}
	public List<Album> getAlbumName(String albumname){
		return albumDao.findByAlbumname(albumname);
		
	}

}
