package com.example.maustin.dragqueenlist;


import java.io.Serializable;

public class Queen  implements Serializable{

    private String name;
    private Integer season;

    public Queen(String name, Integer season) {
        this.name = name;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public Integer getSeason() {
        return season;
    }

}
