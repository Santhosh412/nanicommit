package com.ojas.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MUSICMASTER")
public class Music {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MUSICID")
	private int musicid;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Artist artistid;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Genre genreid;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Title titleid;

	public int getMusicid() {
		return musicid;
	}

	public void setMusicid(int musicid) {
		this.musicid = musicid;
	}

	public Artist getArtistid() {
		return artistid;
	}

	public void setArtistid(Artist artistid) {
		this.artistid = artistid;
	}

	public Genre getGenreid() {
		return genreid;
	}

	public void setGenreid(Genre genreid) {
		this.genreid = genreid;
	}

	public Title getTitleid() {
		return titleid;
	}

	public void setTitleid(Title titleid) {
		this.titleid = titleid;
	}

	public Music(int musicid, Artist artistid, Genre genreid, Title titleid) {
		super();
		this.musicid = musicid;
		this.artistid = artistid;
		this.genreid = genreid;
		this.titleid = titleid;
	}

	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Music [musicid=" + musicid + ", artistid=" + artistid + ", genreid=" + genreid + ", titleid=" + titleid
				+ "]";
	}
	


}
