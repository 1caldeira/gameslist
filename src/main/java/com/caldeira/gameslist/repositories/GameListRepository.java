package com.caldeira.gameslist.repositories;

import com.caldeira.gameslist.entities.Game;
import com.caldeira.gameslist.entities.GameList;
import com.caldeira.gameslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {


}
