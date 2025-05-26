package com.caldeira.gameslist.service;

import com.caldeira.gameslist.dto.GameListDTO;
import com.caldeira.gameslist.entities.GameList;
import com.caldeira.gameslist.repositories.GameListRepository;
import com.caldeira.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class GameListService {
    @Autowired
    GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = repository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }



}
