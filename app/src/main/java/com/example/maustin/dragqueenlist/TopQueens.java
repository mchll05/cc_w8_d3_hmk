package com.example.maustin.dragqueenlist;

import java.util.ArrayList;

public class TopQueens {

    private ArrayList<Queen> list;

    public TopQueens() {
        list = new ArrayList<Queen>();
        list.add(new Queen(1,"Bianca del Rio", "six"));
        list.add(new Queen(2,"Katya", "seven"));
        list.add(new Queen(3, "Trixie Mattel", "seven"));
        list.add(new Queen(4,"Jujubee", "two"));
        list.add(new Queen(5,"Bob the Drag Queen", "eight"));
        list.add(new Queen(6,"Kimchi", "eight"));
        list.add(new Queen(7,"Latrice Royale", "four"));
        list.add(new Queen(8,"Violet Chachki", "seven"));
        list.add(new Queen(9,"Ginger Minj", "seven"));
        list.add(new Queen(10,"Ben DelaCreme", "six"));
    }

        public ArrayList<Queen> getList() {
            return new ArrayList<Queen>(list);
    }

}
