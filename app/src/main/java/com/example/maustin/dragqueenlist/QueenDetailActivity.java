package com.example.maustin.dragqueenlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class QueenDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queen_detail);

        Intent intent = getIntent();
        Queen queen = (Queen)intent.getSerializableExtra("queen");
        Log.d("QueenDetailActivity: ", queen.getName());

        TextView queenNameTextView = findViewById(R.id.queenNameViewID);
        queenNameTextView.setText(queen.getName());
    }
}
