package com.ojas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ALBUMTYPEMASTER")
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ALBUMID")
	private int albumid;
	
	@Column(name="ALBUMNAME")
	private String albumname;
	
	@Column(name="Year")
	private int year;

	public int getAlbumid() {
		return albumid;
	}

	public void setAlbumid(int albumid) {
		this.albumid = albumid;
	}

	public String getAlbumname() {
		return albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Music> getTracks() {
		return tracks;
	}

	public void setTracks(List<Music> tracks) {
		this.tracks = tracks;
	}
	

	public Album(int albumid, String albumname, int year, List<Music> tracks) {
		super();
		this.albumid = albumid;
		this.albumname = albumname;
		this.year = year;
		this.tracks = tracks;
	}


	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Album [albumid=" + albumid + ", albumname=" + albumname + ", year=" + year + ", tracks=" + tracks + "]";
	}


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ALBUMID", referencedColumnName = "albumid")
	private List<Music> tracks;
}
