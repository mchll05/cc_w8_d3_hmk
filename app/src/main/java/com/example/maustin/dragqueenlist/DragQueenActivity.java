package com.example.maustin.dragqueenlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class DragQueenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_queen);

        TopQueens topMovies = new TopQueens();
        ArrayList<Queen> queenList = topQueens.getList();

        TopQueensAdapter topQueensAdapter = new TopQueensAdapter(this, queenList);

        ListView queensListView = findViewById(R.id.queensListViewID);
        queensListView.setAdapter(topQueensAdapter);
    }

    public void onListItemClick(View listItem){
        Queen movie = (Queen) listItem.getTag();
        Log.d("name ", movie.getName());


        Intent intent = new Intent(this, QueenDetailActivity.class);
        intent.putExtra("queen", queen);
        startActivity(intent);
    }



}
