package com.example.maustin.dragqueenlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TopQueensAdapter extends ArrayAdapter<Queen> {

    public TopQueensAdapter(Context context, ArrayList<Queen> queens){
        super(context, 0, queens);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.queen_list_item, parent, false);
        }

        Queen currentQueen = getItem(position);
        TextView ranking = listItemView.findViewById(R.id.nameTextViewID);
        ranking.setText(currentQueen.getName().toString());

        TextView title = listItemView.findViewById(R.id.seasonTextViewID);
        title.setText(currentQueen.getSeason());


        listItemView.setTag(currentQueen);

        return listItemView;

    }
}
