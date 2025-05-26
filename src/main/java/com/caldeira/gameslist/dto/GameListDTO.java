package com.caldeira.gameslist.dto;

import com.caldeira.gameslist.entities.GameList;

public record GameListDTO(Long id, String name) {
    public GameListDTO(GameList entity) {
        this(entity.getId(), entity.getName());
    }
}
