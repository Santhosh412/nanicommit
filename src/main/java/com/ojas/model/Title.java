package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TITLEMASTER")
public class Title {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TITLEID")
	private int titleid;
	
	@Column(name="TITLENAME")
	private String titlename;

	public int getTitleid() {
		return titleid;
	}

	public void setTitleid(int titleid) {
		this.titleid = titleid;
	}

	public String getTitlename() {
		return titlename;
	}

	public void setTitlename(String titlename) {
		this.titlename = titlename;
	}

	public Title(int titleid, String titlename) {
		super();
		this.titleid = titleid;
		this.titlename = titlename;
	}

	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Title [titleid=" + titleid + ", titlename=" + titlename + "]";
	}
	
	

}
