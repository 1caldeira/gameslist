package com.caldeira.gameslist.controller;

import com.caldeira.gameslist.dto.GameDTO;
import com.caldeira.gameslist.dto.GameListDTO;
import com.caldeira.gameslist.dto.GameMinDTO;
import com.caldeira.gameslist.service.GameListService;
import com.caldeira.gameslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/lists")
public class GameListController {

    @Autowired
    private GameListService listService;
    @Autowired
    private GameService gameService;
    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll(){
        List<GameListDTO> result = listService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value="/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return ResponseEntity.ok(result);
    }
}
