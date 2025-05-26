package com.caldeira.gameslist.controller;

import com.caldeira.gameslist.dto.GameDTO;
import com.caldeira.gameslist.dto.GameMinDTO;
import com.caldeira.gameslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/games")
public class GameController {

    @Autowired
    private GameService service;
    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll(){
        List<GameMinDTO> result = service.findAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> getGameById(@PathVariable Long id) {
        GameDTO gameDTO = service.findById(id);
        return ResponseEntity.ok(gameDTO);
    }
}
