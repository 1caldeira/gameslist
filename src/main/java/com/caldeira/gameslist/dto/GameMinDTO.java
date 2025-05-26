package com.caldeira.gameslist.dto;

import com.caldeira.gameslist.entities.Game;
import com.caldeira.gameslist.projections.GameMinProjection;

public record GameMinDTO(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription
) {

    public GameMinDTO(Game entity) {
        this(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getImgUrl(),
                entity.getShortDescription()
        );
    }

    public GameMinDTO(GameMinProjection projection) {
        this(
                projection.getId(),
                projection.getTitle(),
                projection.getGameYear(),
                projection.getImgUrl(),
                projection.getShortDescription()
        );
    }
}