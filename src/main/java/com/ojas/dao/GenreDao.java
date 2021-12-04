package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.Genre;
@Repository
public interface GenreDao extends JpaRepository<Genre, Integer> {

}
