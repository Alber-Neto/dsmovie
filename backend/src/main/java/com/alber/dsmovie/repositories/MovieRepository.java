package com.alber.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alber.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
