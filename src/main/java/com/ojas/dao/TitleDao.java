package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.Title;
@Repository
public interface TitleDao extends JpaRepository<Title, Integer>{

}
