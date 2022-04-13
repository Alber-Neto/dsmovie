package com.alber.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alber.dsmovie.entities.Score;
import com.alber.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
