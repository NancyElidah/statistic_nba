package com.stat.nba.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stat.nba.model.Player;
public interface PlayerRepositories extends JpaRepository<Player, Integer>{

}
