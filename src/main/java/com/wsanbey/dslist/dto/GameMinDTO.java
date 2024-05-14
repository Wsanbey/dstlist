package com.wsanbey.dslist.dto;

import com.wsanbey.dslist.entities.Game;
import com.wsanbey.dslist.projection.GameMinProjection;

public class GameMinDTO
{
    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }
    public GameMinDTO(Game entities) {
        id = entities.getId();
        title = entities.getTitle();
        year = entities.getYear();
        imgUrl = entities.getImgUrl();
        shortDescription = entities.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
