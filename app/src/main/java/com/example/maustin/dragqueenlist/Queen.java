package com.example.maustin.dragqueenlist;


import java.io.Serializable;

public class Queen  implements Serializable{

    private Integer rank;
    private String name;
    private String season;
    

    public Queen(Integer rank, String name, String season) {
        this.rank = rank;
        this.name = name;
        this.season = season;
    }

    public Integer getRank(){
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getSeason() {
        return "(Season " + season + ")";
    }

}
