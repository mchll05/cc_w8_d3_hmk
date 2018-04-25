package com.example.maustin.dragqueenlist;

import java.util.ArrayList;

public class TopQueens {

    private ArrayList<Queen> list;

    public TopQueens() {
        list = new ArrayList<Queen>();
        list.add(new Queen("Bianca del Rio", 6));
        list.add(new Queen("Katya", 7));
        list.add(new Queen("Trixie Mattel", 7));
        list.add(new Queen("Jujubee", 2));
        list.add(new Queen("Bob the Drag Queen", 8));
        list.add(new Queen("Kimchi", 8));
        list.add(new Queen("Latrice Royale", 4));
        list.add(new Queen("Violet Chatchki", 7));
        list.add(new Queen("Ginger Minj", 7));
        list.add(new Queen("Ben DelaCreme", 6));
    }

        public ArrayList<Queen> getList() {
            return new ArrayList<Queen>(list);
    }

}
